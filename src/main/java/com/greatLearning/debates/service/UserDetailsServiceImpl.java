package com.greatLearning.debates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatLearning.debates.entity.User;
import com.greatLearning.debates.repository.UserRepository;
import com.greatLearning.debates.security.UserDetailsDebate;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository user;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<User> users = user.findAll();
		User userDetails = user.getUserByUsername(username);
		if(username == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return new UserDetailsDebate(userDetails);
	}

}
