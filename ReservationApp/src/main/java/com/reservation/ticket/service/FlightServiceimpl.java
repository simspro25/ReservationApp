package com.reservation.ticket.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.ticket.entities.Flight;
import com.reservation.ticket.repos.FlightRepository;

@Service
public class FlightServiceimpl implements FlightService {
	
	@Autowired
	private FlightRepository repository;
	/*
	 * @Override public List<Flight> getAllFlights() { return null; }
	 */

	@Override
	public List<Flight> getAllFlights(String from, String to, Date date) {
		return repository.findFlights(from, to, date);
	}

}
