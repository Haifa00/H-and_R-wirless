package com.skillstorm.data;

import com.skillstorm.beans.UserPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan,Integer> {
    // findAll() method already built on JpaRepository

}
