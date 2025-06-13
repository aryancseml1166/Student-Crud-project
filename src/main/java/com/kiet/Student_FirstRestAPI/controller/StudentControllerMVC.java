package com.kiet.Student_FirstRestAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kiet.Student_FirstRestAPI.model.Student;
import com.kiet.Student_FirstRestAPI.service.StudentService;

@Controller
public class StudentControllerMVC {
	private StudentService service;

	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}
	
	
//http://localhost:9090/students/update/102
	@GetMapping("/students/update/{id}")
	public String getStudent(Model model,@PathVariable int id) {
		Student stud = service.retrieveStudentByid(id);
		model.addAttribute("student", stud);
		return "student";
	}
	
	@GetMapping(path={"/students","/"})
	public String getAllStudent(Model model) {
		List <Student> studs = service.retrieveAllStudent();
		model.addAttribute("students", studs);
		return "index";
	}
//http://localhost:9090/students/add
@GetMapping("/students/add")
public String addPage(Model model) {
	model.addAttribute("student", new Student());
	return "student";
}
	
	//	
@PostMapping("/students/save")
	public String storeStudent(@ModelAttribute Student student) {
	
		service.saveStudent(student);
		return "redirect:/";
		
	}
//http://localhost:9090/students/delete/106	
@GetMapping("/students/delete/{id}")
public String removeStudent(@PathVariable int id) {
	service.remove(id);
	return "redirect:/";
	}

}
