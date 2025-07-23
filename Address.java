package com.mapping;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="addr_dtl")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="addressId")
	private int addressId;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getHomeno() {
		return homeno;
	}
	public void setHomeno(int homeno) {
		this.homeno = homeno;
	}
	@Column(name="pincode")
	private int pincode;
	@Column(name="area")
	private String area;
	@Column(name="homeno")
	private int homeno;

}
