package com.tectonica.geo.server.api;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.ws.rs.NameBinding;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

import com.tectonica.geo.server.api.CorsFilter.CORS;

@CORS
public class CorsFilter implements ContainerResponseFilter
{
	@NameBinding
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface CORS
	{}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException
	{
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();

		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");

		String acrh = requestContext.getHeaderString("Access-Control-Request-Headers");
		if (acrh != null && !acrh.isEmpty())
			headers.add("Access-Control-Allow-Headers", acrh);
	}
}