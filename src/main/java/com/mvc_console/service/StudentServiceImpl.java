package com.mvc_console.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc_console.dao.StudentDAO;
import com.mvc_console.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO studentDAO;

	public boolean createStudent(Student stu) {
		boolean flag=studentDAO.createStudent(stu);
		return flag;
	}

	public Student getStudent(String id) {
		Student st = studentDAO.getStudent(id);
		return st;
	}
	
	public List<Student> getAll(){
		List<Student> list = studentDAO.getAll();
		return list;
	}
	
}
