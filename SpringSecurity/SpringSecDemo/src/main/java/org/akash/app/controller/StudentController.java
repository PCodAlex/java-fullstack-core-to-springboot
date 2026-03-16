package org.akash.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.akash.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	List<Student> students=new ArrayList<>(List.of(
			new Student(1,"Akash","Java"),
			new Student(2,"Ankan","React")));
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return  students;
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
}
