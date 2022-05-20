package com.app.rigistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String userName;
	private int age;
	private String gender;
	private String hobbies;
	private String password;
	public User(int id,String userName, int age, String gender, String hobbies, String password) {
		super();
	    this.id=id;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
		this.password = password;
	}
	public User() {
		super();
	}
	public int id() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + ", gender=" + gender + ", hobbies="
				+ hobbies + ", password=" + password + "]";
	}
	
	

}
