package com.example.coreJavaTestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class CoreJavaToSpringBootApplication {

	public static void main(String[] args) {
		Service service=new Service();
		Controller controller= new Controller();
		
		controller.setService(service);
		
		System.out.println(controller.test());
	}

}
