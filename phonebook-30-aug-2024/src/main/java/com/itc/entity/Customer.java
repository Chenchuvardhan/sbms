package com.itc.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Customer_Details")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer customerId;
private String customerName;
@Column(unique=true)
@NotNull
private String customerEmail;
private String  customerPassword;
@Column(unique=true)
@NotNull
private Long customerMobileNumber;
public Long getCustomerMobileNumber() {
	return customerMobileNumber;
}
public void setCustomerMobileNumber(Long customerMobileNumber) {
	this.customerMobileNumber = customerMobileNumber;
}
@CreationTimestamp
private Date createdDate;
@UpdateTimestamp
private Date updatedDate;
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
}
