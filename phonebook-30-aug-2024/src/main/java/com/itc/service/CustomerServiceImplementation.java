package com.itc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.itc.entity.Customer;
import com.itc.repository.CustomerRepository;
@Service
public  class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public boolean saveCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		boolean isSave=savedCustomer.getCustomerId()!=null;
		return isSave;
	}

	@Override
	public boolean findCustomer(Customer customer) {
		boolean isAvailable=customerRepository.existsById(customer.getCustomerId());
		return false;
	}

	@Override
	public Customer existingCustomerOrNot(Customer customer) {
		List<Customer> byCustomerEmailAndCustomerPassword = customerRepository.existBycustomerEmailAndPassword(customer.getCustomerEmail(),customer.getCustomerPassword());

	if(byCustomerEmailAndCustomerPassword.isEmpty()) {
		return null;
	}	
	else {
		return byCustomerEmailAndCustomerPassword.get(0);
	}
	}

	@Override
	public Customer checkByEmail(String email) {
		List<Customer> byCustomerEmail = customerRepository.findByCustomerEmail(email);
		System.out.println(byCustomerEmail);
		if(byCustomerEmail.isEmpty()) {
		return null;
		}
		return byCustomerEmail.get(0);
		
	}

}
