package com.jpc.lambok;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeleteEmployee extends JpaRepository<Employee, Integer>{
	
		int deleteByVillage(String village);
		
		int deleteByVillageAndGender(String village, char gender);
		
		int deleteByVillageOrPosition(String village, String position);


}
