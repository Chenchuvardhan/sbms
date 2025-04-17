package com.practice;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.Customer;
import com.practice.service.CustomerService;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerService service = context.getBean(CustomerService.class);
		Customer c1 =new Customer();
		c1.setCustId(1001);
		c1.setCustName("Pooja");
		c1.setGender("female");
		c1.setCountry("india");
		Customer c2 =new Customer();
		c2.setCustId(1002);
		c2.setCustName("Mahesh");
		c2.setGender("male");
		c2.setCountry("india");
		Customer c3 =new Customer();
		c3.setCustId(1003);
		c3.setCustName("cummins");
		c3.setGender("male");
		c3.setCountry("australia");
		List<Customer> list = Arrays.asList(c2,c3);
		//service.save(c1);
		//service.saveAll(list);
		//Iterable<Customer> allRecords = service.findAllRecords();
		//allRecords.forEach(e->System.out.println(e));
		/*Optional<Customer> id = service.findThroughID(1002);
		if(id.isPresent())
			System.out.println(id.get());*/
		/*List<Integer> list2 = Arrays.asList(1001,1002);
		Iterable<Customer> moreIds = service.findThroughMoreIds(list2);
		moreIds.forEach(a->{System.out.println(a);});
		*/
		/*Iterable<Customer> iterable = service.findThroughCountry("india");
		iterable.forEach(b->System.out.println(b));*/
		/*Iterable<Customer> iterable2 = service.findThroughGender("male");
		iterable2.forEach(b->System.out.println(b));*/
		/*Iterable<Customer> iterable2 = service.findThroughName("Pooja");
		iterable2.forEach(b->System.out.println(b));*/
		
	}
}
