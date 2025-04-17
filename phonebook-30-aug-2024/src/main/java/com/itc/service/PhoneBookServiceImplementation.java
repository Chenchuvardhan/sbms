package com.itc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.entity.PhoneBook;
import com.itc.repository.PhoneBookRepository;
@Service
public class PhoneBookServiceImplementation implements PhoneBookService {
	@Autowired
	private PhoneBookRepository phoneBookRepository;

	@Override
	public boolean savePhoneNumber(PhoneBook phoneBook) {
        PhoneBook save = phoneBookRepository.save(phoneBook);
		return save.getEmailId()!=null;
	}
	@Override
	public List<PhoneBook> findByEmail(String email) {
		System.out.println(email);
		return phoneBookRepository.findByEmailId(email);
	}

}
