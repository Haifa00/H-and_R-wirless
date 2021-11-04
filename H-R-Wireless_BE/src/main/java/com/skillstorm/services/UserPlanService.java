package com.skillstorm.services;


import com.skillstorm.beans.User;
import com.skillstorm.beans.UserPlan;
import com.skillstorm.beans.UserPlanLine;
import com.skillstorm.data.UserPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.FetchType;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserPlanService {
    private static Logger log = Logger.getAnonymousLogger();

    @Autowired
    UserPlanRepository repository;

    public List<UserPlan> findAll(){
        List<UserPlan> allUsersAndPlans = repository.findAll();
        log.info("serviceUserPlans" + allUsersAndPlans);

        return allUsersAndPlans;
    }
    
    public List<UserPlan> findByUser_Id (int user_Id){
        List<UserPlan> allUsersAndPlans = repository.findByUser_Id(user_Id);
        log.info("serviceUserPlans" + allUsersAndPlans);

        return allUsersAndPlans;
    }

	public UserPlan save(UserPlan userplan) {
		
		return repository.save(userplan);	
		}
  
	
	public Optional<UserPlan> findByUserPlan_Id(int userPlan_Id) {
		log.info(""+ userPlan_Id);
		return repository.findById(userPlan_Id);
	}



}
