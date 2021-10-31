package com.skillstorm.data;

import com.skillstorm.beans.Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plans,Integer> {

   // findAll() method already built on JpaRepository
}
