package com.test.coddix.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.coddix.entity.User;
import com.test.coddix.jpa.repository.UserJpaRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserJpaRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository
			.findOneByEmail(email)
			.orElseThrow(() -> new UsernameNotFoundException("El usuario con email "+email+" no existe"));
		
		System.out.println(user);
			
		return new UserDetailsImpl(user);
	}
	
	
}
