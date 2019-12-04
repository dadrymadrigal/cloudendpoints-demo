package com.accenture.endpoints.CloudEndpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

@Api(name = "helloaccentureendpoints", version = "v1",
		description = "API for String output and get method"
		)

public class EndpointCaller {

	@ApiMethod(name="helloAccenture", path="helloAccenture",
			httpMethod = HttpMethod.GET)
	
	public HelloClass sayHelloAccenture() {
		return new HelloClass();
	}
	
	@ApiMethod(name="helloAccenture", path="helloName",
			httpMethod = HttpMethod.GET)
	
	public HelloClass sayHelloName(@Named("name") String name) {
		return new HelloClass(name);
	}
}
