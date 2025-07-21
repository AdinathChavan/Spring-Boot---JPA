package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class CollegeDatabase {
	
	@Autowired
	CollegeDataRepo repository;
	
	@Modifying
	@Transactional
	public void addData() {
		List<College> data = repository.getData();
		data.forEach(System.out::println);
		
		repository.addDataCollege();
	}
	
	@Modifying
	@Transactional
	public void namedQueryInsert(int code, String name, String telephone, String address) {
		repository.addNamedQuery(code, name, telephone, address);
	}
	
	

}
