package com.reservation.ticket.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.ticket.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
	
	/*
	 * @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture "
	 * ) List<Flight> findFlights(@Param("departureCity")String
	 * from,@Param("arrivalCity") String to, @Param("dateOfDeparture")Date date);
	 */
}


