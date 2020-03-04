package com.reservation.ticket.service;

import java.util.Date;
import java.util.List;

import com.reservation.ticket.entities.Flight;

public interface FlightService {
	//List<Flight> getAllFlights();
	List<Flight> getAllFlights(String from, String to, Date date);

}
