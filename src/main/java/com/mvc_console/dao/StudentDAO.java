package com.mvc_console.dao;

import java.util.List;

import com.mvc_console.model.Student;

public interface StudentDAO {
	public boolean createStudent(Student stu);
	public Student getStudent(String id);
	public List<Student> getAll();
}
