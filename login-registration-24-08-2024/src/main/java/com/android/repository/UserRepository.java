package com.android.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.android.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
