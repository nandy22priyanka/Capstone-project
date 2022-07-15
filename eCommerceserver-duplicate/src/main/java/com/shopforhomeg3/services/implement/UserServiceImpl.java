package com.shopforhomeg3.services.implement;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopforhomeg3.entity.User;
import com.shopforhomeg3.repo.UserRepository;
import com.shopforhomeg3.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	//creating user
		@Override
		public User createUser(User user) throws Exception {
			
			User local=this.userRepository.findByUsername(user.getUserName());
			if(local != null) {
				System.out.println("User is already there !!");
				throw new Exception("user already present !!");
			}else {
				local=this.userRepository.save(user);
			}
			return local;
		}
	
}
