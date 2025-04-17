package com.itc.service;

import org.springframework.stereotype.Service;

import com.itc.entity.Customer;
@Service
public interface CustomerService {
 public boolean saveCustomer(Customer customer);
 public boolean findCustomer(Customer customer);
 public Customer existingCustomerOrNot(Customer customer);
 public Customer checkByEmail(String email);
}
