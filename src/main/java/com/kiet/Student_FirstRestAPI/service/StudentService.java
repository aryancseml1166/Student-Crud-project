package com.kiet.Student_FirstRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.Student_FirstRestAPI.model.Student;
import com.kiet.Student_FirstRestAPI.repository.StudentRepositry;

@Service
public class StudentService {

	private StudentRepositry repository;

	public StudentService(StudentRepositry repository) {
		super();
		this.repository = repository;
		
	}

	public List<Student> retrieveAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Student retrieveStudentByid(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	public void remove(int id) {
	repository.deleteById(id);
		
	}
	
}
