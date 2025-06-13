package com.kiet.Student_FirstRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiet.Student_FirstRestAPI.model.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer> {

}
