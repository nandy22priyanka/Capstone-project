package com.greatlearning.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greatlearning.entity.User;
import com.greatlearning.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/insertUser")
	public String insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		return userService.deleteUser(userId);
	}
	  
	@GetMapping("/getAllUser")  
	public List<User> getUser()   
	{  
		return userService.getUser();   
	}
	  
	@GetMapping("/getUser/{userId}")  
	public Optional<User> getUser(@PathVariable("userId") int userId)   
	{  
	return userService.getUser(userId);   
	} 
	
	@PutMapping("/updateUser/{userId}")
	public User updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
		
	} 

}



 