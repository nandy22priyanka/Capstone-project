package com.greatlearning.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.dao.UserRepo;
import com.greatlearning.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public String insertUser(User user) {
		userRepo.save(user);  
		return "Successfully inserted";
	}
	
	public String deleteUser(int userId) {
		userRepo.deleteById(userId);
		return "Successfully deleted";
	
	}
	
	public List<User> getUser()   
	{  
		return userRepo.findAll();   
	}
	  
	public Optional<User> getUser(int userId)   
	{  
		return userRepo.findById(userId);   
	} 
	
	public User updateUser(User user)
	{
		return userRepo.save(user);
		
	} 


}
