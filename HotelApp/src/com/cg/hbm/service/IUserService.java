package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User removeUser(User user);
	public List<User> showAllUsers();
	public User showUser(User user);
	
	// validate()
	// login and login()
}
