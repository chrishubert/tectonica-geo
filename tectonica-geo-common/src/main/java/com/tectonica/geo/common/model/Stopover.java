package com.tectonica.geo.common.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({ "id", "lat", "lng", "notBeforeSec", "notAfterSec", "name", "arrival", "departure", "order" })
public class Stopover extends Coords
{
	private double notBeforeSec;
	private double notAfterSec;

	/**
	 * optional
	 */
	private String name;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private Double arrival;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private Double departure;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private Integer order;

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Stopover create(double lat, double lng, String name, int notBeforeH, int notBeforeM, int notAfterH, int notAfterM)
	{
		Stopover stopover = new Stopover();
		stopover.setLat(lat);
		stopover.setLng(lng);
		stopover.name = name;
		stopover.notBeforeSec = (notBeforeH * 60.0 + notBeforeM) * 60.0;
		stopover.notAfterSec = (notAfterH * 60.0 + notAfterM) * 60.0;
		return stopover;
	}
}