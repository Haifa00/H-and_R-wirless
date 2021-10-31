package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.beans.UserPlanLine;
import com.skillstorm.data.DeviceRepository;
import com.skillstorm.data.UserPlanLineRepository;

@Service
public class UserPlanLineService {

	@Autowired
	UserPlanLineRepository repository;
	
	public List<UserPlanLine> findByUserPlan_Id(UserPlanLine userPlanLine) {
		
		return repository.findByUserPlan_Id(userPlanLine.getUserPlan_Id());
	}

	public UserPlanLine save(UserPlanLine userPlanLine) {
		
		return repository.save(userPlanLine);
	}

	public boolean existsByPhonenumber(int phonenumber) {
		
		return repository.existsByPhonenumber(phonenumber);
	}

//	public UserPlanLine update(UserPlanLine userPlanLine) {
//		
//		return repository.update(userPlanLine);;
//	}
//
//	public UserPlanLine delete(UserPlanLine userPlanLine) {
//		
//		return null;
//	}

}
