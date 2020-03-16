package com.reservation.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reservation.ticket.entities.Reservation;
import com.reservation.ticket.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService service;

	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {

		Reservation reservation = service.bookFlight(request);

		modelMap.addAttribute("reservation", "Rservation is successful & Reservation No:: " + reservation.getId());
		return "show-reservation-info";

	}
}