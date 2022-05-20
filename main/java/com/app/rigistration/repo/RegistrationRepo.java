package com.app.rigistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rigistration.model.User;

public interface RegistrationRepo extends JpaRepository<User,String>{

	public User findByUserName(String userName);
	public User findByUserNameAndPassword(String userName,String password);


}
