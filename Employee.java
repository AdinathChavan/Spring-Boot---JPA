package com.jpc.lambok;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="employeesdata")
public class Employee {
	
	public Employee(int id, String name, long mobileno, char gender, String village, String position, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.gender = gender;
		this.village = village;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", gender=" + gender + ", village="
				+ village + ", position=" + position + ", salary=" + salary + "]";
	}

	public Employee() {
		System.out.println("Employee object creared...");
	}

	@Id
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Column(name="name")
	private String name;
	
	private long mobileno;
	
	private char gender;
	
	private String village;
	
	@Column(name="position")
	private String position;
	
	private double salary;
	
}
