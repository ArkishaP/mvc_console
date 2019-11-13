package com.mvc_console.model;

public class Flight {

	private String flightid;
	private String airline;
	private String source;
	private String destination;

	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + "]";
	}

	public Flight() {
		super();
	}

	public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
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

}
