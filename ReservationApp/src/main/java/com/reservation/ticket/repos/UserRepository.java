package com.reservation.ticket.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reservation.ticket.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("from User where email=:email")
	User findByEmail(@Param("email")String email);
	
}
