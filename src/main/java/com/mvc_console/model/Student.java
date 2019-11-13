package com.mvc_console.model;

//CREATE TABLE STUDENTS(
//ID VARCHAR(20) NOT NULL PRIMARY KEY,
//NAME VARCHAR(20),
//GRADE VARCHAR(20)
//);

public class Student {
	private String id;
	private String name;
	private String grade;
	// add setter getter default constructor toString
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
