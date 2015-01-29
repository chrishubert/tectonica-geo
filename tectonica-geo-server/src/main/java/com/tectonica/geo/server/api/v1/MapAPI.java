package com.tectonica.geo.server.api.v1;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.tectonica.geo.common.model.DistTime;
import com.tectonica.geo.server.GraphHopperManager;
import com.tectonica.geo.server.api.CorsFilter.CORS;

@Path("/map")
@Produces("application/json")
@Singleton
@CORS
public class MapAPI
{
	@Inject
	private Logger LOG;

	@Inject
	private GraphHopperManager ghm;

	/**
	 * test with
	 * 
	 * <pre>
	 * /v1/map/distTime/32.1214860322075/34.8273127910236/32.0859593952429/34.7757739308293
	 * </pre>
	 */
	@GET
	@Path("/distTime/{fromLat}/{fronLng}/{toLat}/{toLng}")
	public DistTime distTime(@PathParam("fromLat") double fromLat, @PathParam("fronLng") double fronLng, @PathParam("toLat") double toLat,
			@PathParam("toLng") double toLng)
	{
		LOG.info("Inside MapAPI.dist()");
		return ghm.distTime(fromLat, fronLng, toLat, toLng);
	}

}
