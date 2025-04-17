package com.havells;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.havells.dao.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		/*Customers customers = context.getBean(Customers.class);
		customers.setId(1);customers.setName("Raj");
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		customerRepository.save(customers);
		customers.setId(2);
		customers.setName("kulasekhar");
		customerRepository.save(customers);
		customerRepository.delete(customers);
		System.out.println(customerRepository.count());
		System.out.println(customerRepository.existsById(1));
		Iterable<Customers> i=customerRepository.findAll();
		Iterator<Customers> ic=i.iterator();
		while(ic.hasNext()) {
			Customers c= ic.next();
			System.out.println(c.getId()+"--"+c.getName());
		}*/
	}
	

}
