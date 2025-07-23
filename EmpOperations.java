package com.mapping.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mapping.Address;
import com.mapping.Employee;
import com.mapping.repository.EmpRepository;

@Component
public class EmpOperations {
	@Autowired
	EmpRepository repository;
	
	
	public void addEmployee() {
		Address two = new Address();
		two.setHomeno(736);
		two.setPincode(416107);
		two.setArea("dattawad");
		
		Employee one = new Employee();
		one.setGender("male");
		one.setName("adinath chavan");
		one.setAddress(two);
		
		repository.save(one);
		
		
	}

}
