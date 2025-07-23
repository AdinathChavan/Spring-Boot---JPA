package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
