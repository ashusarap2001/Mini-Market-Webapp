package com.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import com.market.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(@Param("email") String email);
}
