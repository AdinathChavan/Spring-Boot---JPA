package com.jpc.lambok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class DeleteOffice {
	
	@Autowired
	DeleteEmployee employee;
	
//	@Transactional
//	public int deleteByVillage(String village) {
//		System.out.println("---deleting data---");
//		return employee.deleteByVillage(village);
//	}
	@Transactional
	public int deleteByVillageAndGender(String village, char gender) {
		System.out.println("---deleting data - AND-----");
		return employee.deleteByVillageAndGender(village, gender);
	}
	@Transactional
	public int deleteByCityOrGender(String City, String position) {
		System.out.println("---deleting data - OR-----");

		return employee.deleteByVillageOrPosition(City, position);
		
	}

}
