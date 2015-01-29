package com.tectonica.geo.common.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "id", "lat", "lng" })
public class Coords
{
	/**
	 * optional, unique id of the location
	 */
	private String id;

	private double lat;

	private double lng;
}
