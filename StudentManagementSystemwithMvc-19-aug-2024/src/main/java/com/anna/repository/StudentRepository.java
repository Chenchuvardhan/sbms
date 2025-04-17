package com.anna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anna.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
