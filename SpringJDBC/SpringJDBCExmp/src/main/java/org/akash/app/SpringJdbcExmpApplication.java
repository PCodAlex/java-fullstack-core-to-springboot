package org.akash.app;

import org.akash.app.model.Student;
import org.akash.app.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExmpApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcExmpApplication.class, args);
		Student student=context.getBean(Student.class);
		Student student2=context.getBean(Student.class);
		StudentService studentService=context.getBean(StudentService.class);
		student.setRollNo(001);
		student.setName("Akash");
		student.setMarks(99);
		studentService.addStudent(student);
		
		student2.setRollNo(002);
		student2.setName("Ankan");
		student2.setMarks(96);
		studentService.addStudent(student2);
		
		studentService.getStudentsDetalis();	
	}
}
