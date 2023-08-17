package com.test.coddix.service;

import com.test.coddix.entity.User;

public interface UserService {

	public User createUser(User user);
	public Iterable<User> getAllUser();
	public User updateUSer(String id, User user);
	public void deleteUser(String id);
}
