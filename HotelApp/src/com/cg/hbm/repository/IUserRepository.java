package com.cg.hbm.repository;

import java.util.List;

import com.cg.hbm.entites.User;

public interface IUserRepository {
	public User addUser(User user);
	public User updateUser(User user);
	public User removeUser(User user);
	public List<User> showAllUsers();
	public User showUser(User user);
}
