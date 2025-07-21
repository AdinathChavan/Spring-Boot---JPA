package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="college")
public class College {
	
	

	@Override
	public String toString() {
		return "College [code=" + code + ", name=" + name + ", telephone=" + telephone + ", address=" + address + "]";
	}

	@Id
	@Column(name="code")
	private int code;
	@Column(name="name")
	private String name;
	@Column(name="telephone")
	private String telephone;
	@Column(name="address")
	private String address;
	
	public College() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public College(int code, String name, String telephone, String address) {
		super();
		this.code = code;
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}
	
	

}
