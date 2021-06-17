package com.mindtree.flight.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Flight {
	
	@Id
	@Column(name="fId")
	private int fId;
	
	@Column(name="flightName")
	private String flightName;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@OneToMany
	private List<Passanger> passanger;
	
	public Flight() {
		
	}




	public Flight(int fId, String flightName, String source, String destination, List<Passanger> passanger) {
		super();
		this.fId = fId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.passanger = passanger;
	}







	public int getfId() {
		return fId;
	}



	public void setfId(int fId) {
		this.fId = fId;
	}



	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}




	public List<Passanger> getPassanger() {
		return passanger;
	}




	public void setPassanger(List<Passanger> passanger) {
		this.passanger = passanger;
	}
	
	
}
