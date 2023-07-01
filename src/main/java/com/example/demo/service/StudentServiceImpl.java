package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepositoryService;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		// Business Logic
		return studentRepositoryService.save(student);
	}

}
