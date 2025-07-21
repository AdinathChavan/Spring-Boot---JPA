package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CollegeDataRepo extends JpaRepository<College, Integer>{
	
	
	
	@Query(value="select *from college",nativeQuery=true)
	List<College> getData();
	
	
	@Query(value="insert into college values(2343,'jjmcoe','8377464323','jaysingpur')",nativeQuery=true)
	void addDataCollege();
	
	@Query(value="insert into college values(:code,:name,:telephone,:address)",nativeQuery=true)
	void addNamedQuery(int code, String name, String telephone, String address);
	

}
