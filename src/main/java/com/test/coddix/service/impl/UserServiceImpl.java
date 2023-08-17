package com.test.coddix.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.coddix.entity.User;
import com.test.coddix.jpa.repository.UserJpaRepository;
import com.test.coddix.repository.UserRepository;
import com.test.coddix.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@Override
	public User createUser(User user) {
		userJpaRepository.save(user);
		
		return userRepository.save(user);
	}

	@Override
	public Iterable<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUSer(String id, User user) {
		Optional<User> optionalUser = userRepository.findById(id);
		if(optionalUser.isPresent()) {
			user.setId(id);
			userJpaRepository.save(user);
			
			return userRepository.save(user);
		}else {
			return null;
		}
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteById(id);
		userJpaRepository.deleteById(id);
		
	}

}
