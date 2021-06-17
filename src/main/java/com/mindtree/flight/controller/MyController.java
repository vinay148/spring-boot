package com.mindtree.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.flight.entities.Flight;
import com.mindtree.flight.entities.Passanger;
import com.mindtree.flight.service.FlightService;

@RestController
public class MyController {
	
	@Autowired
	public FlightService flightservice;
	
	
	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightservice.addFlight(flight);
	}
	
	@PostMapping("/addPassanger")
	public Flight addPassanger(@RequestBody Passanger passanger) {
		return flightservice.addPassanger(passanger);
	}
	
	@GetMapping("/getFlights")
	public List<Flight> getFlights(@RequestBody Object obj) {
		return flightservice.getFlights(obj);
	}
	
	
	
	
}
