package com.example.demo.controller;

import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class StudentController {

	@Autowired
	Validator validator;
	
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping(value = { "test" })
	public Student getCourses() throws Exception {
		logger.info("works");
		return new Student();
	}
	
}
