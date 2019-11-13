package com.mvc_console.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc_console.model.Flight;

@Repository("flightDAO")
public class FlightDAOImpl implements FlightDAO {
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	public List<Flight> getAllFlights(String source){
		List<Flight> list= null;
		String sql= "select * from FLight WHERE source=?";
		list = jdbcTemplateObject.query(sql,
				new Object[]{source}, 
				new FlightMapper());  
		return list;
}
	class FlightMapper implements RowMapper<Flight> {
		public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
			Flight f= new Flight(); 
			f.setFlightid(rs.getString(1));
			f.setAirline(rs.getString(2));
			f.setSource(rs.getString(3));
			f.setDestination(rs.getString(4));
			return f;
		}
		
	}
}
