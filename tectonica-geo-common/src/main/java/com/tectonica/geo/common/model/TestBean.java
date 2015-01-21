package com.tectonica.geo.common.model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class TestBean
{
	/**
	 * the first name
	 */
	private String name;

	@Getter(onMethod = @__({ @JsonIgnore }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private String family;

	// writable but not readable
	@Getter(onMethod = @__({ @JsonIgnore }))
	@Setter(onMethod = @__({ @JsonProperty }))
	private String password;

	// readable but not writable
	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private Date updatedTime;

	protected String getProtected()
	{
		return "ERROR";
	}

	protected void setProtected(String value)
	{
		throw new RuntimeException();
	}

	public String getReadonly()
	{
		return "Password is: " + password + "; Family is: " + family;
	}

	@JsonIgnore
	public void setReadonly()
	{
		// needed for Jackson class scan, due to the annotation, will never be actually invoked
		throw new UnsupportedOperationException();
	}
}
