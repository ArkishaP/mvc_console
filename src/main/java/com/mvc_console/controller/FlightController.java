package com.mvc_console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mvc_console.model.Flight;
import com.mvc_console.service.FlightService;

@Controller("flightController")
public class FlightController {
	@Autowired
	FlightService flightService;
	public List<Flight> getAllFlights(String source){
		return flightService.getAllFlights(source);
	}
}
