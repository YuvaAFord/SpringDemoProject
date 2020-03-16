package com.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.demo.rest.controller.EmployeeController;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackageClasses = EmployeeController.class)

public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
