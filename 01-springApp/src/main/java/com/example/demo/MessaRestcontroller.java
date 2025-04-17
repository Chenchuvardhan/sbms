package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessaRestcontroller {
	
	@GetMapping("/")
	public String msg() {
		return "hello saffu";
	}

}
