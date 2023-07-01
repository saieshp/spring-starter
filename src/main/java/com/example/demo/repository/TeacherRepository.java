package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Teacher;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Integer> {

	public Teacher findTeacherById(Integer id);
	
}
