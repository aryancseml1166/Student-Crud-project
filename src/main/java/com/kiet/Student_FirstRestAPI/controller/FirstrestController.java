package com.kiet.Student_FirstRestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.Student_FirstRestAPI.model.Student;

@RestController
public class FirstrestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul","Java","9015088066");
	}
	
}
