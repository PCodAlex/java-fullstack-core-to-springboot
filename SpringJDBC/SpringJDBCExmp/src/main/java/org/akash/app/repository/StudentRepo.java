package org.akash.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.akash.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
//	private List<Student> studentList=new ArrayList<>();
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public void save(Student student) {
//		System.out.println("----------------------------------------------------------------");
//		studentList.add(student);
//		System.out.println("{ "+student+" } object saved into the DB");
//		System.out.println("----------------------------------------------------------------");
		
		String query="insert into students (rollNo , name, marks) values(?,?,?)";
		
		int rows=jdbc.update(query,student.getRollNo(),student.getName(),student.getMarks());
		System.out.println(rows+" row effected");
	}
	public List<Student> findAll() {
//		studentList.forEach((s)->{System.out.println(s);});
		String selectQuery="select * from students;";
		RowMapper<Student>mapper=new RowMapper<>(){
				@Override
				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Student s=new Student();
					s.setRollNo(rs.getInt("rollno"));
					s.setName(rs.getString("name"));
					s.setMarks(rs.getInt("marks"));
					return s;
				}
		};
		
		return jdbc.query(selectQuery, mapper);
	}
}
