package com.skillstorm.services;


import com.skillstorm.beans.Plans;
import com.skillstorm.data.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    PlanRepository repository;

    public List<Plans> findAll(){
       List<Plans> allPlans = repository.findAll();
       return allPlans;







    }
}
