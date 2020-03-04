package com.reservation.ticket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reservation.ticket.entities.Passenger;

@Service
public interface PassengerService {
	Passenger savePassenger(Passenger passenger);
	Passenger updatePassenger(Passenger passenger);
	Passenger getPassengerById(int ID);
	List<Passenger> getAllPassengers();

}
