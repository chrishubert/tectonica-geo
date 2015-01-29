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
		StringBuffer sb = new StringBuffer();

		sb.append("\n");
		sb.append("     __            __              _").append("\n");
		sb.append("    / /____  _____/ /_____  ____  (_)________ _   ____ ____  ____     ________  ______   _____  _____").append("\n");
		sb.append("   / __/ _ \\/ ___/ __/ __ \\/ __ \\/ / ___/ __ `/  / __ `/ _ \\/ __ \\   / ___/ _ \\/ ___/ | / / _ \\/ ___/").append(
				"\n");
		sb.append("  / /_/  __/ /__/ /_/ /_/ / / / / / /__/ /_/ /  / /_/ /  __/ /_/ /  (__  )  __/ /   | |/ /  __/ /").append("\n");
		sb.append("  \\__/\\___/\\___/\\__/\\____/_/ /_/_/\\___/\\__,_/   \\__, /\\___/\\____/  /____/\\___/_/    |___/\\___/_/").append(
				"\n");
		sb.append("                                               /____/").append("\n");

		LOG.info(sb.toString());
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
