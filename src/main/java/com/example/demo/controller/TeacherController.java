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

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping(value = { "teacherTest" })
	public Teacher testing() throws Exception {
		return new Teacher();
	}

	@PostMapping(value = { "createTeacher" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Teacher createNewTeacher(@RequestBody Teacher teacher) throws Exception {
		return teacherService.createTeacher(teacher);
	}
	
	@GetMapping(value = { "teacher/{id}" })
	public Teacher getTeacherById(@PathVariable(name = "id", required = true) int id) throws Exception {
		return teacherRepository.findTeacherById(id);
	}
	
	@GetMapping(value = { "teacher/all" })
	public List<Teacher> getAllTeachers() throws Exception {
		return (List<Teacher>) teacherRepository.findAll();
	}
	
	@PutMapping(value = { "teacher/update" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Teacher updateTeacher(@RequestBody Teacher teacher) throws Exception {
		
		if(teacher.getId() != null) {
			return teacherRepository.save(teacher);
		}
		return null;
	}
	
	@DeleteMapping(value = { "teacher/delete/{id}" })
	public ResponseEntity<String> deleteTeacherById(@PathVariable(name = "id", required = true) int id) {
		teacherRepository.deleteById(id);
		return ResponseEntity.ok().header("Custom-Header", "foo").body("Successfully deleted");
	}
}
