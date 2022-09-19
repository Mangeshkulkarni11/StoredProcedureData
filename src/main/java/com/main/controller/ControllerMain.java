package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Student;
import com.main.service.StudentService;

@RestController
@RequestMapping("/student")
public class ControllerMain {
	@Autowired
	StudentService studentservice;
	public ControllerMain(	StudentService studentservice)
	{
		super();
		this.studentservice=studentservice;
		
	}
	
	
	
	@RequestMapping("/data")
	public List<Student>getData()
	{
		return studentservice.fetchStudentData();
	}
@GetMapping("/name")
	public List<String> studentName()
	{
		return studentservice. studentName();
	}
@PostMapping("/save")
public ResponseEntity <Student> saveStudent(@RequestBody Student student)
{
	return new ResponseEntity<Student>(studentservice.saveStudent(student),HttpStatus.CREATED);
	
}
}
