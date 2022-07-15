package com.shopforhomeg3.repo;

import org.springframework.stereotype.Repository;

import com.shopforhomeg3.entity.User;


@Repository
public interface UserRepository  {
	public User findByUsername(String userName);

	public User save(User user);
}
