package com.tectonica.geo.server.api;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("v1")
public class RestConfig extends ResourceConfig
{
	public RestConfig()
	{
		// register with Jersey
		packages(this.getClass().getPackage().getName());

		// activate Jackson-based JSON support
		register(JacksonFeature.class);

		// add a filter to allow Jersey responses to include CORS headers for cross-domain support
		register(CorsFilter.class);
	}
}
