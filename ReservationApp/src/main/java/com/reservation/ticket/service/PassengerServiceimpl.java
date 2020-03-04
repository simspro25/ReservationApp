package com.reservation.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.ticket.entities.Passenger;
import com.reservation.ticket.repos.PassengerRepository;

@Service
public class PassengerServiceimpl implements PassengerService {
	@Autowired
	private PassengerRepository repository;
	
	@Override
	public Passenger savePassenger(Passenger passenger) {
		return repository.save(passenger);
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) {
		return repository.save(passenger);
	}

	@Override
	public Passenger getPassengerById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return repository.findAll();
		
	}

}
