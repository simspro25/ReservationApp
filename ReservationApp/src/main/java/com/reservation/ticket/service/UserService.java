package com.reservation.ticket.service;

import java.util.List;

import com.reservation.ticket.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User updateUser(User user);
	User getUserById(int ID);
	List<User> getAllUsers();
	User findByEmail(String email);
	

}
