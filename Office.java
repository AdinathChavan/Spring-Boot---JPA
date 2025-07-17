package com.jpc.lambok;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Office {
	
	@Autowired
	EmployeeDetails employeeDetails;
	
	public void addData() {
		
		List<Employee> list = new ArrayList<>();
		
		//public Employee(int id, String name, long mobileno, char gender, String village, String position, double salary)
		list.add(new Employee(12,"adinath chavan",9988547752l,'M',"kolhapur","java developer",78999.34f));
		list.add(new Employee(13,"divya patil",9988447752l,'F',"sangli","python developer",46599.34f));
		list.add(new Employee(14,"kiran kene",9556844123l,'M',"pune","fronted developer",92999.34f));
		list.add(new Employee(15,"tajashri chavan",9668578452l,'F',"kolhapur","java developer",56999.34f));
		list.add(new Employee(16,"rushi patil",9088547752l,'M',"mumbai","python developer",79599.34f));
		list.add(new Employee(17,"shreya rane",9008547752l,'F',"kolhapur","fronted developer",57999.34f));
			
		employeeDetails.saveAll(list);
	
	}
	
	public void printData() {
		
		List<Employee> list = employeeDetails.findAll();
		
		list.forEach(System.out::println);
		
	}
	
	public void getSpecificData() {
		
	Optional<Employee>  emp = employeeDetails.findById(14);
	
	Employee data = emp.get();
	
	System.out.println(data);
		
	}

}
