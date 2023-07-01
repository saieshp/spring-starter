package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;

	@GetMapping(value = { "test" })
	public Student testing() throws Exception {
		return new Student();
	}
	
	@PostMapping(value = { "createStudent" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student createNewStudent(@RequestBody Student student) throws Exception {
		return studentService.createStudent(student);
	}
	
	@GetMapping(value = { "student/{id}" })
	public Student getStudentById(@PathVariable(name = "id", required = true) int id) throws Exception {
		return studentRepository.findStudentById(id);
	}
	
	@GetMapping(value = { "student/all" })
	public List<Student> getAllStudents() throws Exception {
		return (List<Student>) studentRepository.findAll();
	}
	
	@PutMapping(value = { "student/update" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student updateStudent(@RequestBody Student student) throws Exception {
		
		if(student.getId() != null) {
			return studentRepository.save(student);
		}
		return null;
	}
	
	@DeleteMapping(value = { "student/delete/{id}" })
	public ResponseEntity<String> deleteStudentById(@PathVariable(name = "id", required = true) int id) {
		studentRepository.deleteById(id);
		return ResponseEntity.ok().header("Custom-Header", "foo").body("Successfully deleted");
	}
	
}
