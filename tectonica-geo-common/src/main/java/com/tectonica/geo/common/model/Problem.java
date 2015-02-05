package com.tectonica.geo.common.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@JsonPropertyOrder({ "startCoords", "startTimeSec", "tasks", "endTimeSec", "stopsOrder", "unassignedTasks" })
public class Problem
{
	private Coords startCoords;
	private double startTimeSec;
	private List<Task> tasks;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private double endTimeSec;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private List<String> stopsOrder;

	@Getter(onMethod = @__({ @JsonProperty }))
	@Setter(onMethod = @__({ @JsonIgnore }))
	private List<String> unassignedTasks;
}
