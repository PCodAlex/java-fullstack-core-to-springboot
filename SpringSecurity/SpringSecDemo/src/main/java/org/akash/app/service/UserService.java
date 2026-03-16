package org.akash.app.service;


import org.akash.app.model.User;
import org.akash.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
	
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user);
		return repo.save(user);
	}
	
}
