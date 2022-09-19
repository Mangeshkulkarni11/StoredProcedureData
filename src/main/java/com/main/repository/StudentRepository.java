package com.main.repository;
import com.main.entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer> {
	@Procedure("get_data_student")
	public List<Student>fetchStudentData();
	
	@Procedure("get_name_student")
	public List<String> studentName();
	
	
}

