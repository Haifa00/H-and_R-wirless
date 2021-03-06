package com.skillstorm.data;

import com.skillstorm.beans.UserPlan;
import com.skillstorm.beans.UserPlanLine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;


@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan,Integer> {

    // findAll() method already built on JpaRepository

//	@Query(value = "select * from UserPlan where userPlan_Id = ?1", nativeQuery = true)
//	public UserPlan findByUserPlan_Id(int userPlan_Id);

	@Query(value = "select * from UserPlan where user_Id = ?1", nativeQuery = true)
	public List<UserPlan> findByUser_Id(int user_Id);
	
	@Query(value = "delete * from UserPlan where userPlan_Id = ?1", nativeQuery = true)
	public void deleteById(int userplan_Id);
	
	@Query(value = "select * from UserPlan where userPlan_Id = ?1", nativeQuery = true)
	public Optional<UserPlan> findById(int id);



}