package com.skillstorm.services;


import com.skillstorm.beans.UserPlan;
import com.skillstorm.data.UserPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPlanService {

    @Autowired
    UserPlanRepository repository;

    public List<UserPlan> findAll(){
        List<UserPlan> allUsersAndPlans = repository.findAll();
        return allUsersAndPlans;
    }


}
