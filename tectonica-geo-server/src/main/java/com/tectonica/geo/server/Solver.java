package com.tectonica.geo.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import jsprit.core.algorithm.VehicleRoutingAlgorithm;
import jsprit.core.algorithm.box.SchrimpfFactory;
import jsprit.core.problem.Location;
import jsprit.core.problem.VehicleRoutingProblem;
import jsprit.core.problem.VehicleRoutingProblem.FleetSize;
import jsprit.core.problem.cost.AbstractForwardVehicleRoutingTransportCosts;
import jsprit.core.problem.cost.VehicleRoutingTransportCosts;
import jsprit.core.problem.driver.Driver;
import jsprit.core.problem.job.Job;
import jsprit.core.problem.job.Shipment;
import jsprit.core.problem.solution.VehicleRoutingProblemSolution;
import jsprit.core.problem.solution.route.VehicleRoute;
import jsprit.core.problem.solution.route.activity.TimeWindow;
import jsprit.core.problem.solution.route.activity.TourActivity;
import jsprit.core.problem.vehicle.Vehicle;
import jsprit.core.problem.vehicle.VehicleImpl;
import jsprit.core.problem.vehicle.VehicleType;
import jsprit.core.problem.vehicle.VehicleTypeImpl;
import jsprit.core.reporting.SolutionPrinter;
import jsprit.core.reporting.SolutionPrinter.Print;
import jsprit.core.util.Coordinate;
import jsprit.core.util.Solutions;

import com.tectonica.geo.common.model.Coords;
import com.tectonica.geo.common.model.Delivery;
import com.tectonica.geo.common.model.DistTime;
import com.tectonica.geo.common.model.Problem;
import com.tectonica.geo.common.model.Stopover;

@ApplicationScoped
public class Solver
{
//	@Inject
//	private Logger LOG;

	@Inject
	private GraphHopperManager ghm;

	private VehicleRoutingTransportCosts transporter = new AbstractForwardVehicleRoutingTransportCosts()
	{
		@Override
		public double getTransportCost(Location from, Location to, double departureTime, Driver driver, Vehicle vehicle)
		{
			return distTimeOf(from, to).getMeters();
		}

		@Override
		public double getTransportTime(Location from, Location to, double departureTime, Driver driver, Vehicle vehicle)
		{
			return distTimeOf(from, to).getSeconds();
		}

		private DistTime distTimeOf(Location from, Location to)
		{
			double fromLat = from.getCoordinate().getX();
			double fromLng = from.getCoordinate().getY();
			double toLat = to.getCoordinate().getX();
			double toLng = to.getCoordinate().getY();
			return ghm.distTime(fromLat, fromLng, toLat, toLng);
		}
	};

	public void solve(Problem p)
	{
		VehicleType vehicleType = VehicleTypeImpl.Builder.newInstance("V").build();

		VehicleImpl vehicle = VehicleImpl.Builder.newInstance("v") //
				.setStartLocation(loc(p.getStartCoords())) //
				.setType(vehicleType) //
				.setReturnToDepot(false) //
				.build();

		VehicleRoutingProblem.Builder vrpBuilder = VehicleRoutingProblem.Builder.newInstance();
		vrpBuilder.addVehicle(vehicle);
		vrpBuilder.setFleetSize(FleetSize.FINITE);
		vrpBuilder.setRoutingCost(transporter);

		Map<String, Stopover> index = new HashMap<>();

		for (Delivery delivery : p.getDeliveries())
		{
			final Stopover pickup = delivery.getPickup();
			final Stopover dropoff = delivery.getDropoff();

			Shipment shipment = Shipment.Builder.newInstance(delivery.getId()) //
					.setPickupLocation(loc(pickup)) //
					.setPickupTimeWindow(tw(pickup)) //
					.setPickupServiceTime(delivery.getPickupServiceTimeSec()) //
					.setDeliveryLocation(loc(dropoff)) //
					.setDeliveryTimeWindow(tw(dropoff)) //
					.setDeliveryServiceTime(delivery.getDropoffServiceTimeSec()) //
					.build();
			vrpBuilder.addJob(shipment);

			index.put(pickup.getId(), pickup);
			index.put(dropoff.getId(), dropoff);
		}

		VehicleRoutingProblem problem = vrpBuilder.build();

		VehicleRoutingAlgorithm algorithm = new SchrimpfFactory().createAlgorithm(problem);

		Collection<VehicleRoutingProblemSolution> solutions = algorithm.searchSolutions();

		VehicleRoutingProblemSolution bestSolution = Solutions.bestOf(solutions);

		SolutionPrinter.print(problem, bestSolution, Print.VERBOSE);

		// update problem with solution
		final VehicleRoute vr = bestSolution.getRoutes().iterator().next();
		final List<TourActivity> activities = vr.getActivities();
		int order = 0;
		List<String> stopoverOrder = new ArrayList<>(activities.size());
		for (TourActivity activity : activities)
		{
			final Stopover stopover = index.get(activity.getLocation().getId());
			stopover.setArrival(activity.getArrTime());
			stopover.setDeparture(activity.getEndTime());
			stopover.setOrder(++order);
			stopoverOrder.add(stopover.getId());
		}
		p.setEndTimeSec(vr.getEnd().getArrTime());
		p.setStopoverOrder(stopoverOrder);

		final Collection<Job> unassignedJobs = bestSolution.getUnassignedJobs();
		List<String> unassignedDeliveries = new ArrayList<>(unassignedJobs.size());
		for (Job job : unassignedJobs)
			unassignedDeliveries.add(job.getId());
		p.setUnassignedDeliveries(unassignedDeliveries);
	}

	private Location loc(Coords c)
	{
		if (c.getId() == null || c.getId().isEmpty())
			c.setId(UUID.randomUUID().toString());
		return Location.Builder.newInstance().setCoordinate(Coordinate.newInstance(c.getLat(), c.getLng())).setId(c.getId()).build();
	}

	private TimeWindow tw(Stopover s)
	{
		return new TimeWindow(s.getNotBeforeSec(), s.getNotAfterSec());
	}
}
