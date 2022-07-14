package com.greatLearning.debates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatLearning.debates.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	@Query(value="SELECT u FROM User u WHERE u.userName = ?1")
	public User getUserByUsername(String userName);
	

}
