package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("/")
public class StudentController {
	@Autowired
	StudentRepository studentrepo;

	@PostMapping("student")
	public String insertStudent(@RequestBody Student student) {

		studentrepo.save(student);
		return "Student data inserted";
	}

	@DeleteMapping("student/{roll}")
	public String deleteStudent(@PathVariable Integer roll) {

		if (studentrepo.existsById(roll)) {
			studentrepo.deleteById(roll);
			return "Student data deleted";
		}
		return "Student data not found";
	}
	
	
    @PutMapping("updatestudent/{roll}")
    public String updateStudent(@PathVariable Integer roll, @RequestBody Student updatedStudent) {
        if (roll != null && studentrepo.existsById(roll)) {
            Student existingStudent = studentrepo.findById(roll).orElse(null);
            if (existingStudent != null) {
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setMarks(updatedStudent.getMarks());
                existingStudent.setEmail(updatedStudent.getEmail());
                existingStudent.setContact(updatedStudent.getContact());
                studentrepo.save(existingStudent);
                return "Student data updated";
            }
        }
        return "Student not found";
    }
	
	@GetMapping("studentlist")
	public List<Student> viewAllStudents() {
		return studentrepo.findAll();
	}
	
	@GetMapping("getstudent/{roll}")
	public Optional<Student> getStudent(@PathVariable Integer roll) {
		
		return studentrepo.findById(roll);
		
	}
}
