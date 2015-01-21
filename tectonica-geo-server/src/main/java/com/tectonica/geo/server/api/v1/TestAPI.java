package com.tectonica.geo.server.api.v1;

import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tectonica.geo.common.model.TestBean;

@Path("/test")
@Produces("application/json")
@Singleton
public class TestAPI
{
	@Inject
	private Logger LOG;

//	private Logger LOG = Logger.getLogger(TestAPI.class.getName());

	/**
	 * Use this API to see what how TestBean is serialized into JSON
	 * 
	 * @summary create a dummy test-bean
	 * @return a new zach-melamed bean
	 */
	@GET
	public TestBean get()
	{
		LOG.info("Inside TestAPI.get()");
		TestBean tb = new TestBean();
		tb.setName("zach");
		tb.setFamily("melamed");
		tb.setUpdatedTime(new Date());
		return tb;
	}

	/**
	 * Use this API to see test de-serialization of TestBean from JSON
	 * 
	 * @summary create a test-bean from a given bean
	 * @param bean
	 *            the input test-bean
	 * @return an annotated version of the input test-bean
	 */
	@POST
	@Consumes("application/json")
	public TestBean post(TestBean bean)
	{
		bean.setName(bean.getName() + " indeed");
		return bean;
	}
}
