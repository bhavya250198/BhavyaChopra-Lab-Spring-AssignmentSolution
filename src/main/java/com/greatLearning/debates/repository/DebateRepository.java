package com.greatLearning.debates.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.debates.entity.Debates;

public interface DebateRepository extends JpaRepository<Debates,Integer> {
	
}
