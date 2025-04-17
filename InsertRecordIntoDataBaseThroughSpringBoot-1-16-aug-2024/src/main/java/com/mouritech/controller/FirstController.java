package com.mouritech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mouritech.dao.Employee;
import com.mouritech.service.EmployeeService;

@Controller
public class FirstController {
	@Autowired
	private EmployeeService employeeService;
    @GetMapping("/")
    public String indexPage(Model model) {
    	Employee e=new Employee();
    	e.setEname("");
    	model.addAttribute("employee", e);
    	return "addEmployee";
    }
	@GetMapping("/getemployees")
	public ModelAndView retriveEmployees() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("employees", employeeService.getAllEmployyes());
		mav.setViewName("allemployees");
		return mav;
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(Model model,Employee e) {
		employeeService.save(e);
		model.addAttribute("smsg", "Student Saved");
		return "addEmployee";
	}

	@GetMapping("/addEmployee")
	public String addEmployee() {
		
		return "addEmployee";

	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam(name="eid") Integer id,Model model) {
		employeeService.delete(id);
		model.addAttribute("employees", employeeService.getAllEmployyes());
		return "allemployees";
	}

}
