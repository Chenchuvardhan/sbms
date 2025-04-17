package com.practice.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.practice.entity.Customer;
@Component
public interface CustomerRepository extends CrudRepository<Customer,Integer>{
public Iterable<Customer> findAllByCountry(String name);
public Iterable<Customer> findAllByGender(String gender);
public Iterable<Customer> findAllByCustName(String name);
}
