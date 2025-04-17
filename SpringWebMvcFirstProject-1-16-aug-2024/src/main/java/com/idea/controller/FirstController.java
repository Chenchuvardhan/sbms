package com.idea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	FirstController(){
		System.out.println("FirstController");
	}
	@GetMapping("/welcome")
public ModelAndView welcomeToweb() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("welcome","welcome to Hyderabad");
	modelAndView.setViewName("welcome");
	return modelAndView;
	
}
	@GetMapping("/greetings")
	public ModelAndView wishTo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wish", "Good Evening To Murthy");
		modelAndView.setViewName("greetings");
		return modelAndView;
		
	}
}
