package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Component
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

}
