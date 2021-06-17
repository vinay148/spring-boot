package com.mindtree.flight.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mindtree.flight.entities.Flight;
import com.mindtree.flight.entities.Passanger;

public interface FlightService {
	public Flight addFlight(Flight flight);

	public Flight addPassanger(Passanger passanger);
	
	 @Query(value = "SELECT flightName FROM flight  WHERE flight.source = 'india', flight.destination='banglore'",
	            nativeQuery=true
	    )
	public List<Flight> getFlights(Object obj);
}
