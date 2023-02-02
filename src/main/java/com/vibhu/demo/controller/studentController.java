package com.vibhu.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vibhu.demo.entity.Student;
import com.vibhu.demo.repository.StudentRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class studentController {
	 
	@Autowired 
	StudentRepository studentRepository;
	
	@PostMapping("/student")
	public Student createStudents(@RequestBody Student s) {
		
		return studentRepository.save(new Student(s.getName(),s.getSchool(),s.getDivision()));
		
	}
	@GetMapping("/student/getall")
	public List<Student>  Courses(){
		System.out.println("This api is for getting all students");
		
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{StudentId}")
	public Optional<Student> getStudentById(@PathVariable String StudentId) {
		 
		int studentId = Integer.parseInt(StudentId);
		Optional<Student> s=  studentRepository.findById(studentId);
		return s;
		
	}
}
