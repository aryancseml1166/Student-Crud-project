package com.kiet.Student_FirstRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kiet.Student_FirstRestAPI.model.Student;
import com.kiet.Student_FirstRestAPI.service.StudentService;

//@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	//@RequestMapping(path= {"/students"},method = RequestMethod.GET)
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.retrieveAllStudent();
	}
	//http://localhost:9090/students/101
	//Path Variable
	//@RequestMapping
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.retrieveStudentByid(id);
	}
	
	@PostMapping("/students")
	public Student storeStudent(@RequestBody Student student) {
	
		return 	service.saveStudent(student);
	}
	@DeleteMapping("/students/{id}")
	public void removeStudent(@PathVariable int id) {
		service.remove(id);
	}

}
