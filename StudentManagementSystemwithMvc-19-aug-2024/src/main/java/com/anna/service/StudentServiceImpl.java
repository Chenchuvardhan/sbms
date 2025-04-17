package com.anna.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.anna.entity.Student;
import com.anna.repository.StudentRepo;
import com.anna.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	private StudentRepo repo;

	public StudentServiceImpl(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean saveStudent(Student s) {
		// TODO Auto-generated method stub
		Student student = repo.insertStudent(s);
		return student.getSid() != null;
	}

	@Override
	public List<Student> getStudents() {
		/*
		 * List<Student> stuList = repo.findAll(); return stuList;
		 */
		return repo.getAllStudents();
	}

}
