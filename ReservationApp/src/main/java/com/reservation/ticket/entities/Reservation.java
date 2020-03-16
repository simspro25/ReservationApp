package com.reservation.ticket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "CHECKED_IN")
	private boolean checkedIn;

	@Column(name = " NUMBER_OF_BAGS")
	private int numberOfBags;

	@OneToOne
	private Passenger passenger_Id;

	@OneToOne
	private Flight flight_Id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}



	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags
				+ ", passengerId=" + getPassenger_Id() + ", flightId=" + getFlight_Id() + "]";
	}

	public Flight getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(Flight flight_Id) {
		this.flight_Id = flight_Id;
	}

	public Passenger getPassenger_Id() {
		return passenger_Id;
	}

	public void setPassenger_Id(Passenger passenger_Id) {
		this.passenger_Id = passenger_Id;
	}

}
