package com.android.service;

import com.android.entity.User;

public interface UserService {
public boolean save(User u);
public boolean validateUser(User u);
}
