package com.skillstorm.controllers;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.beans.User;
import com.skillstorm.services.UserService;

	
@RestController		
@RequestMapping("user")	
//@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping
	public Optional<User> findByUserName(User user){
		return service.findByUserName(user);
	}
	
	@PostMapping
	public ResponseEntity<User> SaveUser(User user){
		return null;
	}
	
	@PutMapping
	public ResponseEntity<User> updateUser(User user){
		return null;
	}
	
	@DeleteMapping
	public void deleteUser(User user) {
		
	}
	
	
	
	
}
