package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface StudentService {

	public Student createStudent(Student student);
}
