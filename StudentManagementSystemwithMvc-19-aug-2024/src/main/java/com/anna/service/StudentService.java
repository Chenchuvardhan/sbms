package com.anna.service;

import java.util.List;

import com.anna.entity.Student;

public interface StudentService {
  List<Student> getStudents();
  boolean saveStudent(Student s);
}
