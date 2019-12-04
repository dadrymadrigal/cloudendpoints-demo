package com.accenture.endpoints.CloudEndpoints;

public class HelloClass {
	public String message = "Hello Accenture";
	
	public HelloClass() {
		
	}
	
	public HelloClass(String name) {
		this.message = "Hello " + name;
	}
	
	public String getMessage(){
		return message;
	}
}
