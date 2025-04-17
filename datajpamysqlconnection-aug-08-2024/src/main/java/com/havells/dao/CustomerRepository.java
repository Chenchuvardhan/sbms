package com.havells.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.havells.Customers;
@Component
public interface CustomerRepository extends CrudRepository<Customers, Integer> {

}
