package com.skillstorm.data;

import com.skillstorm.beans.UserPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;


@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan,Integer> {

    // findAll() method already built on JpaRepository



}


