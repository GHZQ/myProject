package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
