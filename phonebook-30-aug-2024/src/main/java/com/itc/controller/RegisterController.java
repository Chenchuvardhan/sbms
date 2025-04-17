package com.itc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.itc.entity.Customer;
import com.itc.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegisterController {
	@Autowired
	private CustomerService customerService;
    @GetMapping("/")
	public String login(Model model) {

		return "login";
	}
    @GetMapping("/register")
    public String register(Model model) {
    	model.addAttribute("customer",new Customer());
    	return "Registration";
    }
    @PostMapping("/saveCustomer")
    public String registerCustomer(Model model,Customer customer) {
    	boolean isSave = customerService.saveCustomer(customer);
    	if(isSave) {
    		model.addAttribute("smsg", "You Registered Successfuly");
    		model.addAttribute("advice","pelease log in and use our services");
    	}
    	else {
    		model.addAttribute("emsg", "please enter valid Details");
    	}
    	return "Registration";
    }
}
