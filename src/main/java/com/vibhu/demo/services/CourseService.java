package com.vibhu.demo.services;

import java.util.List;

import com.vibhu.demo.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public void createCourse(Course c);
	public String deleteCourse(long courseId);
}

