package com.mvc_console.service;

import java.util.List;

import com.mvc_console.model.Flight;

public interface FlightService {
	public List<Flight> getAllFlights(String source);
}
