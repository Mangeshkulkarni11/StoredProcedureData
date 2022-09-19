package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Student;
import com.main.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	public List<Student> fetchStudentData()
	{
		return repo.fetchStudentData();
	}
	
public List<String>  studentName()
{
	return repo.studentName();
}
public Student saveStudent(Student student)
{
	return repo.save(student);
}
}
