package com.tectonica.geo.common.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@JsonPropertyOrder({ "startCoords", "startTimeSec", "deliveries", "endTimeSec", "stopoverOrder", "unassignedDeliveries" })
public class Problem
{
	private Coords startCoords;
	private double startTimeSec;
	private List<Delivery> deliveries;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private double endTimeSec;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private List<String> stopoverOrder;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private List<String> unassignedDeliveries;
}
