package com.uniliver.dao;

import org.springframework.stereotype.Component;

@Component
public class MySqlUserDaoImpl implements UserDao {

	@Override
	public void printUsers() {
		System.out.println(this.getClass().getName());
		System.out.println("MySql database executed");

	}

	@Override
	public void setUsers() {
		System.out.println("Users Data inserted");
		
	}

}
