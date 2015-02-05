package com.tectonica.geo.server.api.v1;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tectonica.geo.common.model.Coords;
import com.tectonica.geo.common.model.Task;
import com.tectonica.geo.common.model.Problem;
import com.tectonica.geo.common.model.Stop;
import com.tectonica.geo.server.Solver;
import com.tectonica.geo.server.api.CorsFilter.CORS;

@Path("/solve")
@Produces("application/json")
@Consumes("application/json")
@Singleton
@CORS
public class SolverAPI
{
	@Inject
	private Logger LOG;

	@Inject
	private Solver solver;

	/**
	 * solves a courier problem, required to make pickups and dropoffs in several locations at given time windows
	 * 
	 * @summary find best route
	 * @param problem
	 *            set of restrictions for the courier
	 * @return
	 *         the same problem, along with solution fields
	 */
	@POST
	public Problem solve(Problem problem)
	{
		LOG.info("Inside SolverAPI.solve()");

		solver.solve(problem);

		return problem;
	}

	/**
	 * demo API, showing a problem and its solution
	 * 
	 * @summary demonstrate solver
	 * @return
	 *         solved problem
	 */
	@GET
	public Problem solveDemo()
	{
		return solve(prepareProblem());
	}

	private Problem prepareProblem()
	{
		final double SERVICE_TIME_SEC = 15.0 * 60.0;

		final Coords startCoords = new Coords();
		startCoords.setLat(32.059461);
		startCoords.setLng(34.795434);

		final double startTime = 0.0;

		Stop a1 = Stop.create(32.091243, 34.787795, "A1", 0, 0, 3, 0);
		Stop a2 = Stop.create(32.042874, 34.775264, "A2", 0, 0, 3, 0);
		Stop b1 = Stop.create(32.089426, 34.776637, "B1", 0, 0, 3, 0);
		Stop b2 = Stop.create(32.093716, 34.820239, "B2", 0, 0, 3, 0);
		Stop c1 = Stop.create(32.054223, 34.755609, "C1", 0, 0, 3, 0);
		Stop c2 = Stop.create(32.084481, 34.809339, "C2", 0, 0, 3, 0);
		Task task1 = Task.create("A1-A2", a1, a2, SERVICE_TIME_SEC, SERVICE_TIME_SEC);
		Task task2 = Task.create("B1-B2", b1, b2, SERVICE_TIME_SEC, SERVICE_TIME_SEC);
		Task task3 = Task.create("C1-C2", c1, c2, SERVICE_TIME_SEC, SERVICE_TIME_SEC);
		List<Task> tasks = Arrays.asList(task1, task2, task3);

		Problem problem = new Problem();
		problem.setStartTimeSec(startTime);
		problem.setStartCoords(startCoords);
		problem.setTasks(tasks);
		return problem;
	}
}
