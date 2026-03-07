package org.akash.app;

import java.util.List;

import org.akash.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where name= ?1")
	List<Student> findByName(String name);
	List<Student> findByMarks(int marks);
	List<Student> findByMarksLessThan(int marks);
	
}
