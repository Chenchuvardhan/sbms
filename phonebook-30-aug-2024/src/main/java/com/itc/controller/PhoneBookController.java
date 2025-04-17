package com.itc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itc.entity.PhoneBook;
import com.itc.service.PhoneBookService;

@Controller
public class PhoneBookController {
	@Autowired
	private PhoneBookService phoneBookService;
	@PostMapping("/saveNumber")
	public String SavePhoneBook(@RequestParam String contactName,
			@RequestParam(name="mobileNumber") long mobilenumber, Model model) {
		String email=(String)LoginController.httpSession.getAttribute("email");
		PhoneBook phoneBook=new PhoneBook();
		System.out.println(email);
		phoneBook.setEmailId(email);
		phoneBook.setContactName(contactName);
		phoneBook.setMobileNumber(mobilenumber);
		boolean savePhoneNumber = phoneBookService.savePhoneNumber(phoneBook);
		if (savePhoneNumber) {
			model.addAttribute("smsg", "saved successfuly");
			return "phonebook";
		} else {
			model.addAttribute("emsg","please enter valid details");
			return "phonebook";
		}
	}
	@GetMapping("/view")
	public String showTable(Model model) {
		List<PhoneBook> list = phoneBookService.findByEmail((String)LoginController.httpSession.getAttribute("email"));
		model.addAttribute("phonebook", list);
		return "phonebooktable";
	}
	@GetMapping("/phonebook")
	public String returnPhoneBook(Model model) {
		return "phonebook";
	}
}
