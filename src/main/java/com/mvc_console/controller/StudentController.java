package com.mvc_console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mvc_console.model.Student;
import com.mvc_console.service.StudentService;

@Controller("studentController")
public class StudentController {
	@Autowired
	StudentService studentService;
	public boolean createStudent(){
		Student stu= new Student();
		stu.setId("005");
		stu.setName("JuChe");
		stu.setGrade("Second");
		boolean flag= studentService.createStudent(stu);
		return flag;
	}
	public Student getStudent(String id){
		Student st = studentService.getStudent(id);
		return st;
	}
	public List<Student> getAll(){
		List<Student> list = studentService.getAll();
		return list;
	}
}
