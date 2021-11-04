package com.skillstorm.services;

import java.util.List;
import java.util.Optional;

import com.skillstorm.beans.Plans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillstorm.beans.User;
import com.skillstorm.data.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

    public List<User> findAll() {
		List<User> allUsers = repository.findAll();
		return allUsers;
	}


	public Optional<User> findByUserNameAndPassword(String username, String password) {

		return  repository.findByUsernameAndPassword(username, password);
	}

	public User save(User user) {
		User newUser = repository.save(user);
		return newUser;
	}


	public Optional<User> findByUserid(int userid) {
		
		return repository.findById(userid);
	}

//	public User updateUser(User user) {
//		return repository.updateUser(user);
//	}


//	public void deleteUser(User user) {
//
//	}
}
