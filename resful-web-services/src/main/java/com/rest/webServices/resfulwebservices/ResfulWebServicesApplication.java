package com.rest.webServices.resfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rest.webServices")
public class ResfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResfulWebServicesApplication.class, args);
	}

}
