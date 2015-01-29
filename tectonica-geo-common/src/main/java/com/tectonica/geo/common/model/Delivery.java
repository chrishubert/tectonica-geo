package com.tectonica.geo.common.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@JsonPropertyOrder({ "id", "pickup", "dropoff", "pickupServiceTimeSec", "dropoffServiceTimeSec" })
public class Delivery
{
	private String id;
	private Stopover pickup;
	private Stopover dropoff;
	private double pickupServiceTimeSec;
	private double dropoffServiceTimeSec;

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Delivery create(String id, Stopover pickup, Stopover dropoff, double pickupServiceTimeSec, double dropoffServiceTimeSec)
	{
		Delivery delivery = new Delivery();
		delivery.id = id;
		delivery.pickup = pickup;
		delivery.dropoff = dropoff;
		delivery.pickupServiceTimeSec = pickupServiceTimeSec;
		delivery.dropoffServiceTimeSec = dropoffServiceTimeSec;
		return delivery;
	}
}
