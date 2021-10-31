package com.skillstorm.controllers;



import java.util.List;
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
import java.util.logging.Logger;
import com.skillstorm.beans.Device;
import com.skillstorm.beans.User;
import com.skillstorm.beans.UserPlanLine;
import com.skillstorm.services.UserService;
import com.skillstorm.services.DeviceService;
import com.skillstorm.services.UserPlanLineService;

@RestController		
@RequestMapping("UserPlanLine/v1")	
@CrossOrigin("http://localhost:4200")
public class UserPlanLineController {

	@Autowired
	UserPlanLineService service;
	
	private static Logger log = Logger.getAnonymousLogger();
	
//	@CrossOrigin(origins = "http://localhost:4200")
//	@GetMapping
//	public ResponseEntity<List<UserPlanLine>> findAll(){
//		log.info("findAll() was called");
//		return  new ResponseEntity<List<UserPlanLine>>(service.findAll(), HttpStatus.OK);
//	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public ResponseEntity<UserPlanLine> save(@RequestBody UserPlanLine userPlanLine){
		log.info("save() method called");
		return new ResponseEntity<>(service.save(userPlanLine), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("phoneNumbers")
	public  ResponseEntity<Boolean> existsByPhoneNumber(@RequestBody int phoneNumber){
		log.info("existsByPhoneNumber() method called");
		return new ResponseEntity<>(service.existsByPhonenumber(phoneNumber), HttpStatus.CREATED);
	}
//	@PutMapping
//	public ResponseEntity<UserPlanLine> update(UserPlanLine userPlanLine){
//		log.info("update() method called");
//		return new ResponseEntity<>(service.update(userPlanLine), HttpStatus.CREATED);;
//	}
//	
//	@DeleteMapping
//	public ResponseEntity<UserPlanLine> delete(UserPlanLine userPlanLine) {
//		return new ResponseEntity<>(service.delete(userPlanLine), HttpStatus.CREATED);;
//		
//	}
	
	
}
