package com.example.coreJavaTestService;

public class Controller {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	
	public String test() {
		return service.test();
		
	}

}
