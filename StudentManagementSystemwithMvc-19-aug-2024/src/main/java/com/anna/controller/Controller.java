package com.anna.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anna.entity.Student;
import com.anna.service.StudentService;

public class Controller {
	private StudentService ss;

	public Controller(StudentService ss) {
		super();
		this.ss = ss;
	}

	@GetMapping("/studentslist")
	public ModelAndView getAllStudents() {
		ModelAndView mav = new ModelAndView();
		List<Student> students = ss.getStudents();
		mav.addObject("students", students);
		mav.setViewName("viewstudents");
		return mav;
	}

	@PostMapping("/savestudent")
	public ModelAndView saveStudentDetails(Student s) {
		boolean isSaveStudent = ss.saveStudent(s);
		ModelAndView mav = new ModelAndView();
		String msg;
		if (isSaveStudent) {
			msg = "Student Saved";
			mav.addObject("msg",msg);
			return mav;
		}
		else {
		mav.addObject("msg","Student Not Saved");
		}
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/")
	public ModelAndView studentViewPage() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}
