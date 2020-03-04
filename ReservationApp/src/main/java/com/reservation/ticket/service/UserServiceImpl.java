package com.reservation.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.ticket.entities.User;
import com.reservation.ticket.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public User getUserById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
		
	}

	@Override
	public User findByEmail(String email) {
		return repository.findByEmail(email);
	}

	
}
