package com.reservation.ticket.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reservation.ticket.entities.Flight;
import com.reservation.ticket.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	/*
	 * @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture "
	 * ) List<Flight> findFlights(@Param("departureCity")String
	 * from,@Param("arrivalCity") String to, @Param("dateOfDeparture")Date date);
	 */
}
