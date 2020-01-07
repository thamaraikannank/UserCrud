package com.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public boolean addUser(User user) {
		List<User> list = userRepository.findByEmail(user.getEmail());
		if (list.size() > 0) {
			return false;
		} else {
			userRepository.save(user);
			return true;
		}
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(long userId) {
		User user = userRepository.findById(userId).get();
		user.setActive(0);
		userRepository.save(user);
	}

}
