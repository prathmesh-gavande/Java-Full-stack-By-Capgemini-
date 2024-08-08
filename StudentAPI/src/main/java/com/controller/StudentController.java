package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository studentrepo;
	@PostMapping("/student")
	public String createStudent(@RequestBody Student student) {
		
		studentrepo.save(student);
		
		return "Stdent added in database";
	}
}
