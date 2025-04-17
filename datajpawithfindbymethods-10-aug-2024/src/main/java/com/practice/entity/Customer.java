package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", country=" + country
				+ "]";
	}
@Id
private Integer custId;
private String custName;
private String gender;
private String country;
public Integer getCustId() {
	return custId;
}
public void setCustId(Integer custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
