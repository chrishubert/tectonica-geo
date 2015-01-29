package com.tectonica.geo.common.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "pickup", "dropoff", "pickupServiceTimeSec", "dropoffServiceTimeSec" })
public class Delivery
{
	private Stopover pickup;
	private Stopover dropoff;
	private double pickupServiceTimeSec;
	private double dropoffServiceTimeSec;

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Delivery create(Stopover pickup, Stopover dropoff, double pickupServiceTimeSec, double dropoffServiceTimeSec)
	{
		Delivery delivery = new Delivery();
		delivery.pickup = pickup;
		delivery.dropoff = dropoff;
		delivery.pickupServiceTimeSec = pickupServiceTimeSec;
		delivery.dropoffServiceTimeSec = dropoffServiceTimeSec;
		return delivery;
	}
}
