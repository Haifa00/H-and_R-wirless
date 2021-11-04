package com.skillstorm.controllers;


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import com.skillstorm.beans.Plans;
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
@RequestMapping("user/v1")
@CrossOrigin("http://localhost:4200")
public class UserController {

	private static Logger log = Logger.getAnonymousLogger();

	@Autowired
	UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        List<User> allUsers= service.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);

    }



	@GetMapping("/{username}/{password}")
	public ResponseEntity<Optional<User>> findByUsernameAndPassword(@PathVariable String username,
																	@PathVariable String password) {

		return new ResponseEntity<Optional<User>>(service.findByUserNameAndPassword(username, password),HttpStatus.OK);
	}

	@PostMapping("user")
	public ResponseEntity<User> save(@RequestBody User user) {


		User newUser = service.save(user);

		return new ResponseEntity<>(newUser, HttpStatus.CREATED);

	}
	
	
	@GetMapping("{userid}")
	public ResponseEntity<Optional<User>> findByUserid(@PathVariable int userid){
		return new ResponseEntity<>(service.findByUserid(userid), HttpStatus.OK);
	}

//	@PutMapping
//	public ResponseEntity<User> updateUser(User user){
//		return null;
//	}
//
//	@DeleteMapping
//	public void deleteUser(User user) {
//
//	}




}
