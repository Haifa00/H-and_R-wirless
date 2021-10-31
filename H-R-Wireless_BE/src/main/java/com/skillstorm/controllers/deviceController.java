//package com.skillstorm.controllers;
//
//
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.skillstorm.beans.Device;
//import com.skillstorm.beans.User;
//import com.skillstorm.services.UserService;
//import com.skillstorm.services.deviceService;
//
//@RestController
//@RequestMapping("*We need to decide the url*")
////@CrossOrigin("http://localhost:4200")
//public class deviceController {
//
//	@Autowired
//	deviceService service;
//
//	@GetMapping
//	public ResponseEntity<List<Device>> findDevice(Device device){
//		return null;
//	}
//
//	@PostMapping
//	public ResponseEntity<Device> SaveDevice(Device device){
//		return null;
//	}
//
//	@PutMapping
//	public ResponseEntity<Device> updateDevice(Device device){
//		return null;
//	}
//
//	@DeleteMapping
//	public void deleteDevice(Device device) {
//
//	}
//}
