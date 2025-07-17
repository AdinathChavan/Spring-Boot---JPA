package com.jpc.lambok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaLambokApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JpaLambokApplication.class, args);
		
		Office data = container.getBean(Office.class);
		//insert operation in database
		data.addData();
		System.out.println("-------printing data from database-------");
		//printing/ select operation in database
		data.printData();
		
		//getting primary data @Id
		data.getSpecificData();
		
	}

}
