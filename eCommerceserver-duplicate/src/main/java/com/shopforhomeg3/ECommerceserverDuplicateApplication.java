package com.shopforhomeg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopforhomeg3.entity.User;
import com.shopforhomeg3.services.UserService;

@SpringBootApplication
public class ECommerceserverDuplicateApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceserverDuplicateApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		
		User user=new User();
		user.setName("Ritik Bansod");
		user.setUserName("ritikb");
		user.setPassword("ritik@123");
		user.setEmail("ritikbansod71@gmail.com");
		user.setPhone("9146565879");
		user.setAddress("Ayodhya Nagar, Nagpur-440024");
		user.setUserRole("ADMIN");
		
		User user1 = this.userService.createUser(user);
		System.out.println(user1.getUserName());
	}
}
	

	
		
