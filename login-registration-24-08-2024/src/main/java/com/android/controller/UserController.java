package com.android.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.android.entity.User;
import com.android.service.UserService;

@Controller
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String registerUser(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}

	@PostMapping("/register")
	public String saveUser(User user, Model model) {
		boolean isSave = userService.save(user);
		if (isSave) {
			model.addAttribute("smsg", "User Saved");
		} else {
			model.addAttribute("emsg", "User not  Saved");
		}
		return "registration";

	}
}
