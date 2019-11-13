package com.mvc_console.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc_console.dao.FlightDAO;
import com.mvc_console.model.Flight;

@Service("flightService")
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightDAO flightDAO;
	
	public List<Flight> getAllFlights(String source){
		return flightDAO.getAllFlights(source);
	}
}
