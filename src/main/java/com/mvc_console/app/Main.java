package com.mvc_console.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc_console.controller.FlightController;
import com.mvc_console.controller.StudentController;
import com.mvc_console.model.Flight;
import com.mvc_console.model.Student;

public class Main {
private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		StudentController controller= (StudentController)applicationContext.getBean("studentController");
		FlightController fcontroller= (FlightController)applicationContext.getBean("flightController");
//		FlightController fc = (FlightController)applicationContext.getBean("flightController");
		
//		System.out.println(controller.createStudent());

//		System.out.println(controller.getStudent("003"));
//		List<Student> list = controller.getAll();
//		for(Student st:list){
//			System.out.println(st);
//		}
		
		List<Flight> list = fcontroller.getAllFlights("KOL");
		for(Flight f:list){
			System.out.println(f);
		}
	}

}
