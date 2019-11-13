package com.mvc_console.service;

import java.util.List;

import com.mvc_console.model.Student;

public interface StudentService {
	public boolean createStudent(Student stu);
	public Student getStudent(String id);
	public List<Student> getAll();
}
