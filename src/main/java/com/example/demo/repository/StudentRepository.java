package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
	
	public Student findStudentById(Integer id);

}
