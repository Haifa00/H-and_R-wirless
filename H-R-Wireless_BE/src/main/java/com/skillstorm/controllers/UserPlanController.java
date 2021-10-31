package com.skillstorm.controllers;

import com.skillstorm.beans.Plans;
import com.skillstorm.beans.UserPlan;
import com.skillstorm.services.UserPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userplan/v1")
@CrossOrigin("http://localhost:4200")
public class UserPlanController {

    @Autowired
    UserPlanService service;

    @GetMapping
    public ResponseEntity<List<UserPlan>> findAll(){

        List<UserPlan> allUsersAndPlans= service.findAll();
        return new ResponseEntity<>(allUsersAndPlans, HttpStatus.OK);

    }


}
