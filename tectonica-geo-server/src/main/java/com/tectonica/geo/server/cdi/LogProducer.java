package com.tectonica.geo.server.cdi;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogProducer
{
	@Produces
	public Logger produceLogger(InjectionPoint injectionPoint)
	{
		return (Logger) Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
}
