package com.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	private int id;
	
	@Column(name="roll_num")
	private int rollNo;
	
	@Column(name="stu_name")
	private String studentName;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="city")
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, int rollNo, String studentName, String branch, String city) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.branch = branch;
		this.city = city;
	}
	public Student() {
		super();
	
	}

}
