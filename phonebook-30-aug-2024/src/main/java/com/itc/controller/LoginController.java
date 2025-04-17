package com.itc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.itc.entity.Customer;
import com.itc.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired
	private CustomerService customerService;
	public static HttpSession httpSession;
	private Customer customer;

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model,
			HttpServletRequest request) {
		Customer customer = new Customer();
		customer.setCustomerEmail(email);
		customer.setCustomerPassword(password);
		System.out.println(email);
		System.out.println(password);
		Customer existingCustomerOrNot = customerService.existingCustomerOrNot(customer);
		if (existingCustomerOrNot != null) {
			if (existingCustomerOrNot.getCustomerEmail().equals(customer.getCustomerEmail())
					&& existingCustomerOrNot.getCustomerPassword().equals(customer.getCustomerPassword())) {
				httpSession = request.getSession(true);
				httpSession.setAttribute("email", email);
				httpSession.setAttribute("password", password);
				return "phonebook";
			} else {
				model.addAttribute("advice1", "Please Enter Valid Details or");
				model.addAttribute("advice2", "You need to be register");
				return "login";
			}
		} else {
			model.addAttribute("advice1", "Please Enter Valid Details or");
			model.addAttribute("advice2", "You need to be register");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logoutApplication(Model model) {
		httpSession.invalidate();
		return "login";
	}

	@GetMapping("/forgot")
	public String forgotPassword() {
		return "enteremail";
	}

	@PostMapping("/checkemail")
	public String checkEmail(@RequestParam String email, Model model) {
		Customer checkByEmail = customerService.checkByEmail(email);
		this.customer = checkByEmail;
		System.out.println(checkByEmail);
		if (checkByEmail != null)
			System.out.println(checkByEmail.getCustomerEmail());
		if (checkByEmail != null) {
			return "forgotpassword";
		} else {
			model.addAttribute("msg1", "please enter valid details");
			model.addAttribute("msg2", "or you need to be register");
			return "enteremail";
		}
	}
    @PostMapping("/changepassword")
	public String changePassword(@RequestParam(name = "changepassword") String changePassword,
			@RequestParam(name = "confirmpassword") String confirmPassword, Model model) {
		if (changePassword.equals(confirmPassword)) {
			customer.setCustomerPassword(confirmPassword);
			boolean isSaveCustomer = customerService.saveCustomer(customer);
			if (isSaveCustomer) {
				model.addAttribute("msg1", "your password updated successfully");
				return "forgotpassword";
			}
			return "forgotpassword";
		} else {
			model.addAttribute("msg", "check password once");
			return "forgotpassword";
		}
	}
}
