package com.vibhu.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.vibhu.demo.entity.Course;
import com.vibhu.demo.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("this is home");
		return "this is home";
	}
	
	@GetMapping("/course/getall")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
	}
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public void createCourse(@RequestBody Course c) {
		
		this.courseService.createCourse(c);
	}
	
	@DeleteMapping("/course/{courseId}")
	public String deleteCourse(@PathVariable long courseId) {
		return this.courseService.deleteCourse(courseId);
	}
	
	
}
