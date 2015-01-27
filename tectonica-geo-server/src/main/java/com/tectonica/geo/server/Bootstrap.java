package com.tectonica.geo.server;

import java.io.IOException;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Bootstrap implements Servlet
{
	@Inject
	private Logger LOG;

	@Inject
	private GraphHopperManager ghm;

	@Override
	public void init(ServletConfig sc) throws ServletException
	{
		LOG.info("STARTING BOOSTRAP **************************************************");
		ghm.init();
		LOG.info("FINISHED BOOSTRAP **************************************************");
	}

	@Override
	public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException
	{}

	@Override
	public ServletConfig getServletConfig()
	{
		throw new UnsupportedOperationException("N/A");
	}

	@Override
	public String getServletInfo()
	{
		throw new UnsupportedOperationException("N/A");
	}

	@Override
	public void destroy()
	{}
}
