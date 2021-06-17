package com.mindtree.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.flight.entities.Flight;

public interface Flightdao extends JpaRepository<Flight, Integer> {
	
}
