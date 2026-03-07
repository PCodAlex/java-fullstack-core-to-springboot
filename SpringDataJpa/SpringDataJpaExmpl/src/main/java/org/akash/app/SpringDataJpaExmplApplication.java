package org.akash.app;

import java.util.Optional;

import org.akash.app.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class SpringDataJpaExmplApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaExmplApplication.class, args);
		
		StudentRepo studentRepo=context.getBean(StudentRepo.class);
		
//		Student student1=context.getBean(Student.class);
//		student1.setRollNo(101);
//		student1.setName("Akash");
//		student1.setMarks(100);
//		
		Student student2=context.getBean(Student.class);
		student2.setRollNo(102);
		student2.setName("Ankan");
		student2.setMarks(81);
//		
//		Student student3=context.getBean(Student.class);
//		student3.setRollNo(103);
//		student3.setName("Amit");
//		student3.setMarks(97);
//		
//		studentRepo.save(student1);
//		studentRepo.save(student2);
//		studentRepo.save(student3);
		
//		System.out.println(studentRepo.findAll());
		
//		System.out.println(studentRepo.findById(102));
		
//		Optional<Student> s=studentRepo.findById(104);
//		System.out.println(s.orElse(new Student()));
		
//		System.out.println(studentRepo.findByName("Amit"));
		
//		System.out.println(studentRepo.findByMarks(82));
		
//		System.out.println(studentRepo.findByMarksLessThan(99));
		
//		UPDATE
//		studentRepo.save(student2);
		
		studentRepo.delete(student2);
		
	}

}
