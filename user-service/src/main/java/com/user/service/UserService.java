package com.user.service;

import java.util.List;

import com.user.model.User;

public interface UserService {

	List<User> getAllUsers();

	boolean addUser(User user);

	void updateUser(User user);

	void deleteUser(long userId);

}
