package com.skillstorm.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillstorm.beans.User;
import com.skillstorm.data.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	
	
	public Optional<User> findByUserName(User user) {
		
		return repository.findByUserName(user.getUserName());
	}
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
//	public User updateUser(User user) {
//		return repository.updateUser(user);
//	}


	public void deleteUser(User user) {
		
	}
}
