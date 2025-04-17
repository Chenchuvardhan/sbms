package com.uniliver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uniliver.dao.UserDao;
@Component
public class UserService {
 @Autowired//Field Injection
 private UserDao dao;
 //@Autowired
 public UserService(UserDao dao) {
	 this.dao=dao;
 }
 public UserService() {
	 System.out.println("UserService Object with 0-arg constructor is created");
 }
 public void printUsers() {
	 dao.printUsers();
	 dao.setUsers();
 }
}
