package com.skillstorm.controllers;

import com.skillstorm.beans.Plans;
import com.skillstorm.beans.User;
import com.skillstorm.beans.UserPlan;
import com.skillstorm.beans.UserPlanLine;
import com.skillstorm.services.UserPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("userplan/v1")
@CrossOrigin("http://localhost:4200")
public class UserPlanController {
    private static Logger log = Logger.getAnonymousLogger();

    @Autowired
    UserPlanService service;

    @GetMapping
    public ResponseEntity<List<UserPlan>> findAll(){

        List<UserPlan> allUsersAndPlans= service.findAll();
        log.info("allUsersPlan" + allUsersAndPlans);
        return new ResponseEntity<>(allUsersAndPlans, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping("saveUserPlan")
    public ResponseEntity<UserPlan> save(@RequestBody UserPlan userplan){
    	log.info("saveUserPlan() method called" + userplan.toString());
		return new ResponseEntity<>(service.save(userplan) ,HttpStatus.OK);
	}
    

    @CrossOrigin("http://localhost:4200")
    @GetMapping("getUserPlanByUserPlanId/{userPlan_Id}")
    public ResponseEntity<Optional<UserPlan>> findByUserPlanId(@PathVariable int userPlan_Id){
    	log.info("" + userPlan_Id);
    	
        return new ResponseEntity<Optional<UserPlan>>(service.findByUserPlan_Id(userPlan_Id), HttpStatus.OK);
    }

}
