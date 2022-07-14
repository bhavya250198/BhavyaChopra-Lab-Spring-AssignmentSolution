package com.greatLearning.debates.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.greatLearning.debates.entity.Roles;
import com.greatLearning.debates.entity.User;



public class UserDetailsDebate implements org.springframework.security.core.userdetails.UserDetails  {

	private User user;
	
	public UserDetailsDebate(User user) {
		
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Roles> roles = user.getRoles();
		List<SimpleGrantedAuthority> simple = new ArrayList<>();
		for(Roles role: roles) {
			simple.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		// TODO Auto-generated method stub
		return simple;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
