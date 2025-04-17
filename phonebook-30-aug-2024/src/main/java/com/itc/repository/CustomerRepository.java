package com.itc.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itc.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
@Query("from Customer where customerEmail=:email and customerPassword=:password")
public List<Customer> existBycustomerEmailAndPassword(String email,String password);
public List<Customer> findByCustomerEmail(String email);
}
