package com.skillstorm.data;


import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.beans.UserPlanLine;

@Repository
public interface UserPlanLineRepository  extends JpaRepository<UserPlanLine, Integer>{

	
	@Query(value = "select * from UserPlanLine where userPlan_Id = ?1", nativeQuery = true)
	public List<UserPlanLine> findByUserPlan_Id(int userPlan_Id);

 
	public boolean existsByPhonenumber(Long phonenumber);
	
	@Transactional(propagation = Propagation.REQUIRED)
	public UserPlanLine save(UserPlanLine line);
}
