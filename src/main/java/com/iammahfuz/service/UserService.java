package com.iammahfuz.service;

import java.util.List;

import com.iammahfuz.model.User;

public interface UserService {
	public List<User> findAllUsers();
	public User findUserById(int id);
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
