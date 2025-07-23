package com.mapping;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_dtl")
public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_gen")
	 @SequenceGenerator(name = "emp_seq_gen", sequenceName = "employee_seq", allocationSize = 1)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="addressId")
	Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
