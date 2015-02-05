var com = { qmino : { miredot : {}}};
com.qmino.miredot.restApiSource = {"licenceType":"PRO","miredotRevision":null,"allowUsageTracking":false,"issuesTabHidden":false,"miredotVersion":null,"licenceErrorMessage":null,"validLicence":true,"projectTitle":"Tectonica Geo Server","initialCollapseLevel":100,"jsonDocEnabled":true,"baseUrl":"http:\/\/tectonica-geo.appspot.com\/v1","projectVersion":"1.0-SNAPSHOT","jsonDocHidden":false,"buildSystem":"maven 3","projectName":"tectonica-geo-server","dateOfGeneration":"2015-02-09 10:32:18"};
com.qmino.miredot.restApiSource.tos = {
	com_tectonica_geo_common_model_Coords_in: { "type": "complex", "name": "com_tectonica_geo_common_model_Coords_in", "content": [] },
	com_tectonica_geo_common_model_Coords_out: { "type": "complex", "name": "com_tectonica_geo_common_model_Coords_out", "content": [] },
	com_tectonica_geo_common_model_DistTime_in: { "type": "complex", "name": "com_tectonica_geo_common_model_DistTime_in", "content": [] },
	com_tectonica_geo_common_model_DistTime_out: { "type": "complex", "name": "com_tectonica_geo_common_model_DistTime_out", "content": [] },
	com_tectonica_geo_common_model_Task_in: { "type": "complex", "name": "com_tectonica_geo_common_model_Task_in", "content": [] },
	com_tectonica_geo_common_model_Task_out: { "type": "complex", "name": "com_tectonica_geo_common_model_Task_out", "content": [] },
	com_tectonica_geo_common_model_Stop_in: { "type": "complex", "name": "com_tectonica_geo_common_model_Stop_in", "content": [] },
	com_tectonica_geo_common_model_Stop_out: { "type": "complex", "name": "com_tectonica_geo_common_model_Stop_out", "content": [] },
	com_tectonica_geo_common_model_Problem_in: { "type": "complex", "name": "com_tectonica_geo_common_model_Problem_in", "content": [] },
	com_tectonica_geo_common_model_Problem_out: { "type": "complex", "name": "com_tectonica_geo_common_model_Problem_out", "content": [] }
};

com.qmino.miredot.restApiSource.enums = {

};
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_in"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "lat",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "lng",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_in"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_in"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_out"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "lat",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "lng",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_out"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_out"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_in"].content = [ 
	{
		"name": "meters",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "seconds",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_in"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_in"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_out"].content = [ 
	{
		"name": "meters",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "seconds",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_out"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_out"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_in"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "pickup",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_in"],
		"deprecated": false
	},
	{
		"name": "dropoff",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_in"],
		"deprecated": false
	},
	{
		"name": "pickupServiceTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "dropoffServiceTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_in"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_in"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_out"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "pickup",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_out"],
		"deprecated": false
	},
	{
		"name": "dropoff",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_out"],
		"deprecated": false
	},
	{
		"name": "pickupServiceTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "dropoffServiceTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_out"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_out"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_in"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "lat",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "lng",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "notBeforeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "notAfterSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "name",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_in"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_in"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_out"].content = [ 
	{
		"name": "id",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "lat",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "lng",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "notBeforeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "notAfterSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "name",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "string" },
		"deprecated": false
	},
	{
		"name": "arrival",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "departure",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "order",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "integer" },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_out"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Stop_out"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_in"].content = [ 
	{
		"name": "startCoords",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_in"],
		"deprecated": false
	},
	{
		"name": "startTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "tasks",
		"comment": null,
		"typeValue": { "type": "collection", "typeValue":com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_in"] },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_in"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_in"].comment = null;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_out"].content = [ 
	{
		"name": "startCoords",
		"comment": null,
		"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Coords_out"],
		"deprecated": false
	},
	{
		"name": "startTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "tasks",
		"comment": null,
		"typeValue": { "type": "collection", "typeValue":com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Task_out"] },
		"deprecated": false
	},
	{
		"name": "endTimeSec",
		"comment": null,
		"typeValue": { "type": "simple", "typeValue": "number" },
		"deprecated": false
	},
	{
		"name": "stopsOrder",
		"comment": null,
		"typeValue": { "type": "collection", "typeValue":{ "type": "simple", "typeValue": "string" } },
		"deprecated": false
	},
	{
		"name": "unassignedTasks",
		"comment": null,
		"typeValue": { "type": "collection", "typeValue":{ "type": "simple", "typeValue": "string" } },
		"deprecated": false}
];
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_out"].ordered = true;
com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_out"].comment = null;
com.qmino.miredot.restApiSource.interfaces = [
	{
		"beschrijving": "demo API, showing a problem and its solution",
		"url": "/solve/",
		"http": "GET",
		"title": "demonstrate solver",
		"tags": [],
		"authors": [],
		"compressed": false,
		"deprecated": false,
		"consumes": [],
		"produces": ["application/json"],
		"roles": [],
		"output": {"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_out"], "comment": "solved problem"},
		"statusCodes": [],
		"hash": "1917927777",
		"inputs": {
                "PATH": [],
                "QUERY": [],
                "BODY": [],
                "HEADER": [],
                "COOKIE": [],
                "FORM": [],
                "MATRIX": []
            }
	},
	{
		"beschrijving": "Given two points, FROM and TO, estimates the time and distance for driving from one to another. <p> Testable example: <pre>\n /v1/map/distTime/32.1214860322075/34.8273127910236/32.0859593952429/34.7757739308293\n </pre>",
		"url": "/map/distTime/{fromLat}/{fronLng}/{toLat}/{toLng}",
		"http": "GET",
		"title": "measure distance and time",
		"tags": [],
		"authors": [],
		"compressed": false,
		"deprecated": false,
		"consumes": [],
		"produces": ["application/json"],
		"roles": [],
		"output": {"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_DistTime_out"], "comment": "the time and distance for driving between FROM and TO"},
		"statusCodes": [],
		"hash": "1509920571",
		"inputs": {
                "PATH": [
                    {"name": "fromLat", "typeValue": { "type": "simple", "typeValue": "number" }, "comment": "Latitude of FROM location", "jaxrs": "PATH"},
                    {"name": "fronLng", "typeValue": { "type": "simple", "typeValue": "number" }, "comment": "Longitude of FROM location", "jaxrs": "PATH"},
                    {"name": "toLat", "typeValue": { "type": "simple", "typeValue": "number" }, "comment": "Latitude of TO location", "jaxrs": "PATH"},
                    {"name": "toLng", "typeValue": { "type": "simple", "typeValue": "number" }, "comment": "Longitude of TO location", "jaxrs": "PATH"}
                ],
                "QUERY": [],
                "BODY": [],
                "HEADER": [],
                "COOKIE": [],
                "FORM": [],
                "MATRIX": []
            }
	},
	{
		"beschrijving": "Returns environment information (headers, cookies, JVM and OS variables)",
		"url": "/info/",
		"http": "GET",
		"title": "get environment",
		"tags": [],
		"authors": [],
		"compressed": false,
		"deprecated": false,
		"consumes": [],
		"produces": ["text/html"],
		"roles": [],
		"output": {"typeValue": { "type": "simple", "typeValue": "string" }, "comment": "HTML page with environment information"},
		"statusCodes": [],
		"hash": "1714259225",
		"inputs": {
                "PATH": [],
                "QUERY": [],
                "BODY": [],
                "HEADER": [],
                "COOKIE": [],
                "FORM": [],
                "MATRIX": []
            }
	},
	{
		"beschrijving": "solves a courier problem, required to make pickups and dropoffs in several locations at given time windows",
		"url": "/solve/",
		"http": "POST",
		"title": "find best route",
		"tags": [],
		"authors": [],
		"compressed": false,
		"deprecated": false,
		"consumes": ["application/json"],
		"produces": ["application/json"],
		"roles": [],
		"output": {"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_out"], "comment": "the same problem, along with solution fields"},
		"statusCodes": [],
		"hash": "-824646047",
		"inputs": {
                "PATH": [],
                "QUERY": [],
                "BODY": [{"typeValue": com.qmino.miredot.restApiSource.tos["com_tectonica_geo_common_model_Problem_in"], "comment": "set of restrictions for the courier", "jaxrs": "BODY"}],
                "HEADER": [],
                "COOKIE": [],
                "FORM": [],
                "MATRIX": []
            }
	}];
com.qmino.miredot.projectWarnings = [
];
com.qmino.miredot.processErrors  = [
];

