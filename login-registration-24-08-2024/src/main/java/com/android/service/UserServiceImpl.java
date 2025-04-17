package com.android.service;

import org.springframework.stereotype.Service;

import com.android.entity.User;
import com.android.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public boolean save(User u) {
		User save = userRepo.save(u);
		return save.getUserId() != null;
	}

	@Override
	public boolean validateUser(User u) {
		return userRepo.existsById(u.getUserId());
	}

}
