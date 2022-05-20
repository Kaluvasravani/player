package com.app.rigistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.rigistration.model.User;
import com.app.rigistration.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUserName=user.getuserName();
		if(tempUserName !=null && !"".equals(tempUserName)) {
			User userObj=service.fetchUserByUserName(tempUserName);
			if(userObj !=null) {
				throw new Exception("user with"+tempUserName+"is already exist");
			}
		}
		User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUserName=user.getuserName();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempUserName != null && tempPass != null) {
			userObj=service.fetchUserByUserNameAndPassword(tempUserName,tempPass);
		}
		if(userObj == null) {
			throw new Exception("bad credentials");
		}
		return userObj;
	}
}
