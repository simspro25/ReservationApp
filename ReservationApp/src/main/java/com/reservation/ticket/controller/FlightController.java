package com.reservation.ticket.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservation.ticket.entities.Flight;
import com.reservation.ticket.repos.FlightRepository;
import com.reservation.ticket.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	private FlightService service;

	@Autowired
	private FlightRepository repository;
	
	@RequestMapping("/find-flight")
	public String getAllFlights(@RequestParam("departureCity") String from, @RequestParam("arrivalCity") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date date, ModelMap modelMap) {

		List<Flight> allFlights = service.getAllFlights(from, to, date);

		System.out.println("allFlights.size()" + allFlights.size());
		modelMap.addAttribute("flights", allFlights);

		return "show-flight";

	}
	
	
	@RequestMapping("/showCompleteReservartion")
	public String completeReservation(@RequestParam("flightId")Long id,ModelMap modelMap) {
		Flight flight=repository.findById(id).get();
		
		modelMap.addAttribute("flight", flight);
		return "complete-reservation";
		
	}	
}