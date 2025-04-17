package com.itc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.entity.PhoneBook;

public interface PhoneBookRepository extends JpaRepository<PhoneBook,Integer>{
List<PhoneBook> findByEmailId(String email);
}
