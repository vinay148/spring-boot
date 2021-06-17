package com.mindtree.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.flight.dao.Flightdao;
import com.mindtree.flight.dao.Passangerdao;
import com.mindtree.flight.entities.Flight;
import com.mindtree.flight.entities.Passanger;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	public Flightdao flightdao; 
	
	@Autowired
	public Passangerdao passangerdao;
	
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightdao.save(flight);
		return null;
	}


	@Override
	public Flight addPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		passangerdao.save(passanger);
		return null;
	}


	@Override
	public List<Flight> getFlights(Object obj) {
		// TODO Auto-generated method stub
		//Flight f = new Flight();
		
		 return flightdao.findAll();
		//return f;
	}

}
