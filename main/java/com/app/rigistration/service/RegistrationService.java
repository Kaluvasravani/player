package com.app.rigistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.rigistration.model.User;
import com.app.rigistration.repo.RegistrationRepo;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepo repo;
	public User saveUser(User user) {
		return repo.save(user);
	}
	public User fetchUserByUserName(String userName) {
		return repo.findByUserName(userName);
	}
	public User fetchUserByUserNameAndPassword(String userName,String password) {
		return repo.findByUserNameAndPassword(userName,password);
	}


}
