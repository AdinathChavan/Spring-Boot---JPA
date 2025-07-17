package com.jpc.lambok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteDatabaseOperation {
	
	@Autowired
	EmployeeDetails details;
	
	void deleteById(int id) {
		System.out.println("----Database delete Query----");
		details.deleteById(id);
	}
	

}
