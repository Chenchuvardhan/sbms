package com.mouritech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.mouritech.dao.Employee;
import com.mouritech.service.EmployeeRepository;
import com.mouritech.service.EmployeeService;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    EmployeeService employeeService = context.getBean(EmployeeService.class);
	    EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
	    /*Employee e = new Employee();
	    e.setEid(101);
	    e.setEname("siva");
	    e.setEsal(10000.00);;
	    e.setGender("male");
	    employeeRepository.save(e);
	    System.out.println("Employee Record Successfully Inserted");*/
	}

}
