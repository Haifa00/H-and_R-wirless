package com.skillstorm.data;

import com.skillstorm.beans.UserPlan;
import com.skillstorm.beans.UserPlanLine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan,Integer> {
    // findAll() method already built on JpaRepository
	@Query(value = "select * from UserPlan where userPlan_Id = ?1", nativeQuery = true)
	public List<UserPlanLine> findByUserPlan_Id(int userPlan_Id);
}
