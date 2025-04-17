package com.mouritech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.dao.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository ers;

	public Iterable<Employee> getAllEmployyes() {
		return ers.findAll();
	}

	public void save(Employee e) {
		ers.save(e);
	}
	public void delete(int id) {
		ers.deleteById(id);
	}
}
