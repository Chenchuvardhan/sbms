package com.itc.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itc.entity.PhoneBook;
@Service
public interface PhoneBookService {
  boolean savePhoneNumber(PhoneBook phoneBook);
  List<PhoneBook> findByEmail(String email);
}
