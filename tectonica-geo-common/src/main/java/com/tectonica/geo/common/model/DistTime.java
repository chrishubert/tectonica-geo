package com.tectonica.geo.common.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@JsonPropertyOrder({ "meters", "seconds" })
public class DistTime
{
	private double meters;
	private double seconds;
	
	// TODO: add get/setMiles() + get/setMinutes(), etc.
}
