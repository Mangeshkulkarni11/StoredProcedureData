package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoredprocedurewithspringbootApplication {
//	@Autowired
//	static StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(StoredprocedurewithspringbootApplication.class, args);
		System.out.println("Code is running....");
		
//		List<Student> user=repo.fetchStudentData();
//		user.forEach(e->System.out.println(e));
	}

}

