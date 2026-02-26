package org.akash.app.service;

import java.util.List;

import org.akash.app.model.Student;
import org.akash.app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepo studentRepo;
	
	public StudentRepo getStudentRepo() {
		return studentRepo;
	}
	@Autowired
	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public void addStudent(Student student) {
//		System.out.println("added :"+ student);
		studentRepo.save(student);
	}
	public void getStudentsDetalis() {
		System.out.println("______________________________________________");
		System.out.println("fetching all the data from the table");
		System.out.println("______________________________________________");
		List<Student>studentList =studentRepo.findAll();
		studentList.forEach((s)->{System.out.println(s);});
	}
}
