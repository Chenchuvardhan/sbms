package com.mouritech.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
private Integer eid;
private String ename;
private Double esal;
private String gender;
public Integer getEid() {
	return eid;
}
public void setEid(Integer object) {
	this.eid = object;
}
public String getEname() {
	return ename;
}
public void setEname(String object) {
	this.ename = object;
}
public Double getEsal() {
	return esal;
}
public void setEsal(Double esal) {
	this.esal = esal;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", gender=" + gender + "]";
}

}
