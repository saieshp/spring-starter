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
@Table(name = "TEACHER_INFO")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME", nullable = false, length = 30)
	@NotNull
	@Size(min = 3, max = 30)
	private String name;
	
	@Column(name = "DEPARTMENT", nullable = false, length = 30)
	@NotNull
	@Size(min = 3, max = 30)
	private String department;
	
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(String classInfo) {
		this.classInfo = classInfo;
	}
}
