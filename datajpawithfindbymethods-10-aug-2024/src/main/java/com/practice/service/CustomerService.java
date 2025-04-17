package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Customer;
import com.practice.repository.CustomerRepository;
@Service
public class CustomerService {
@Autowired
private CustomerRepository cr;
public void save(Customer c1) {
	cr.save(c1);
}
public void saveAll(List<Customer> l1) {
	cr.saveAll(l1);
}
public Iterable<Customer> findAllRecords(){
	return cr.findAll();
}
public Optional<Customer> findThroughID(Integer i) {
	return cr.findById(i);
}
public Iterable<Customer> findThroughMoreIds(List<Integer> l){
	return cr.findAllById(l);
}
public Iterable<Customer> findThroughCountry(String country,String gender){
	return cr.findAllByCountry(country);
}
public Iterable<Customer> findThroughGender(String gender){
	return cr.findAllByGender(gender);
}
public Iterable<Customer> findThroughName(String name){
	return cr.findAllByCustName(name);
}
}

