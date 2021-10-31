package com.skillstorm.controllers;

import com.skillstorm.beans.Plans;
import com.skillstorm.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("plans/v1")
@CrossOrigin("http://localhost:4200")
public class PlanController {

    @Autowired
    PlanService service;

    @GetMapping
    public ResponseEntity<List<Plans>> findAll(){

        List<Plans> allPlans= service.findAll();
        return new ResponseEntity<>(allPlans, HttpStatus.OK);

    }

}
