package com.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mapping.operations.EmpOperations;

@SpringBootApplication
public class JpaMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaMappingApplication.class, args);
		
		EmpOperations operation = container.getBean(EmpOperations.class);
		
		for(int i=0; i<10; i++) {
		operation.addEmployee();
	}
	}

}
