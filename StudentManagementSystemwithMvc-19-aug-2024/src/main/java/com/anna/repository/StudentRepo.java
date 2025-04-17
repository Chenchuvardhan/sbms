package com.anna.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.anna.entity.Student;

public class StudentRepo {
private StudentRepository sr;

public StudentRepo(StudentRepository sr) {
	this.sr = sr;
}
public Student insertStudent(Student s) {
	Student save = sr.save(s);
	return save;
}
public List<Student> getAllStudents(){
 return sr.findAll();	
}
}
