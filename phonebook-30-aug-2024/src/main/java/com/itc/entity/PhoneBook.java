package com.itc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "PhoneBookDetails")
public class PhoneBook {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String emailId;
	private String contactName;
	@NotNull
	private Long mobileNumber;
	@Override
	public String toString() {
		return "PhoneBook [id=" + id + ", emailId=" + emailId + ", name=" + contactName + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
}
