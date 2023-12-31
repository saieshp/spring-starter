package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "STUDENT_INFO")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME", nullable = false, length = 30)
	@NotNull
	@Size(min = 3, max = 30)
	private String name;
	
	@Column(name = "GENDER", nullable = false, length = 1)
	@NotNull
	@Size(min = 1, max = 1)
	private String gender;
	
	@Column(name = "ROLL_NUMBER", nullable = false, length = 10)
	@NotNull
	@Size(min = 5, max = 10)
	private String rollNumber;
	
	@Column(name = "CLASS_Info", nullable = false, length = 10)
	@NotNull
	@Size(min = 1, max = 10)
	private String classInfo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(String classInfo) {
		this.classInfo = classInfo;
	}		
}
