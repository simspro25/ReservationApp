package com.reservation.ticket.service;

import com.reservation.ticket.controller.ReservationRequest;
import com.reservation.ticket.entities.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);

}
