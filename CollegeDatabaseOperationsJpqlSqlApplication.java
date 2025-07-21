package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CollegeDatabaseOperationsJpqlSqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container  = SpringApplication.run(CollegeDatabaseOperationsJpqlSqlApplication.class, args);
		
		CollegeDatabase data = container.getBean(CollegeDatabase.class);
		
		data.addData();
		System.out.println("data added successfully...");
		
		data.namedQueryInsert(7833, "sit", "9837473234", "ichalkaranji");
	}

}
