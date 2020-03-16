package com.reservation.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.ticket.controller.ReservationRequest;
import com.reservation.ticket.entities.Flight;
import com.reservation.ticket.entities.Passenger;
import com.reservation.ticket.entities.Reservation;
import com.reservation.ticket.repos.FlightRepository;
import com.reservation.ticket.repos.PassengerRepository;
import com.reservation.ticket.repos.ReservationRepository;

@Service
public class ReservationServiceimpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		Long flightId=request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();

		Passenger p = new Passenger();
		p.setFirstname(request.getFirstName());
		p.setLastname(request.getLastName());
		p.setEmail(request.getEmail());
		p.setPhone(request.getPhone());

		Passenger savedPassenger = passengerRepository.save(p);

		Reservation r = new Reservation();
		r.setFlight_Id(flight);
		r.setPassenger_Id(savedPassenger);

		r.setCheckedIn(false);

		Reservation savedReservation = reservationRepository.save(r);

		return savedReservation;
	}
}
