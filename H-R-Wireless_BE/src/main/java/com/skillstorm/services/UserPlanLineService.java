package com.skillstorm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.beans.UserPlanLine;
import com.skillstorm.data.DeviceRepository;
import com.skillstorm.data.UserPlanLineRepository;

@Service
public class UserPlanLineService {

	@Autowired
	UserPlanLineRepository repository;
	
	private static Logger log = Logger.getAnonymousLogger();
	
	public List<UserPlanLine> findByUserPlan_Id(UserPlanLine userPlanLine) {
		
		return repository.findByUserPlan_Id(userPlanLine.getUserplan_Id());
	}
	
	public UserPlanLine save(UserPlanLine line) {
		return repository.save(line);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public UserPlanLine[] saveBulk(UserPlanLine[] lines) {
		UserPlanLine[] dbLines = new UserPlanLine[lines.length];
		int i = 0;
		for(UserPlanLine line : lines) {
			log.info(""+line);
			dbLines[i] = (repository.save(line));
			i++;
		}
		return dbLines;
	}
	
	
	
	
	public List<Long> generatePhoneNumbers() {
		
		   List<Long> phoneNumbers = new ArrayList<Long>();
		   long phonenumber;
		   for( int i = 0; i < 12;){
			   phonenumber = Long.parseLong( (int)(Math.floor(10000 + Math.random() * 90000)) + "" + (int)(Math.floor(10000 + Math.random() * 90000)));
		  if(!(repository.existsByPhonenumber(phonenumber))){
		  phoneNumbers.add(phonenumber);
		  i++;
		  }
		}
		return phoneNumbers;
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
