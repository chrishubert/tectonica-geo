package com.tectonica.geo.common.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@JsonPropertyOrder({ "id", "pickup", "dropoff", "pickupServiceTimeSec", "dropoffServiceTimeSec" })
public class Task
{
	private String id;
	private Stop pickup;
	private Stop dropoff;
	private double pickupServiceTimeSec;
	private double dropoffServiceTimeSec;

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Task create(String id, Stop pickup, Stop dropoff, double pickupServiceTimeSec, double dropoffServiceTimeSec)
	{
		Task delivery = new Task();
		delivery.id = id;
		delivery.pickup = pickup;
		delivery.dropoff = dropoff;
		delivery.pickupServiceTimeSec = pickupServiceTimeSec;
		delivery.dropoffServiceTimeSec = dropoffServiceTimeSec;
		return delivery;
	}
}
