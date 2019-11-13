package com.mvc_console.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc_console.model.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	public boolean createStudent(Student stu) {
		String sql = "INSERT INTO students (id,name,grade) VALUES (?,?,?)";
		int result = jdbcTemplateObject.update(sql,new Object[]{stu.getId(),stu.getName(),stu.getGrade()});
		if(result>0){
			System.out.println("student is added "+stu);
			return true;
		}else{
			System.out.println("Not added "+stu);
			return false;
		}
	}
	
	public Student getStudent(String id){
		String sql = "SELECT * FROM students WHERE id=?";
		Student st = jdbcTemplateObject.query(sql, 
				new Object[]{id}, 
				new ResultSetExtractor<Student>(){
					public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
						Student s = new Student();
						if(rs.next()){
							s.setId(rs.getString(1));
							s.setName(rs.getString(2));
							s.setGrade(rs.getString(3));
						}
						return s;
					}
		});
		
		
		return st;
	}

	public List<Student> getAll() {
		List<Student> list = null;
		String sql = "SELECT * FROM students";
		list = jdbcTemplateObject.query(sql, new StudentMapper());
		return list;
	}
	class StudentMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student s = new Student();
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setGrade(rs.getString(3));
			return s;
		}
		
	}
	

	
}
