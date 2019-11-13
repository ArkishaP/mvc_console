package com.mvc_console.dao;

import java.util.List;

import com.mvc_console.model.Flight;

public interface FlightDAO {

	public List<Flight> getAllFlights(String source);
}
