package com.mouritech.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mouritech.dao.Employee;
@Component
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
