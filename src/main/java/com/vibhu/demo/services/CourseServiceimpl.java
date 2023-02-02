package com.vibhu.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vibhu.demo.entity.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course( 453,"java","this course contaions basics of java"));
		list.add(new Course(485,"DSA","this course contains data structure"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
			}
		}
		return c;
	}
	@Override
	public void createCourse(Course c) {
		// TODO Auto-generated method stub
		list.add(new Course(c.getId(),c.getCourse(),c.getDescription()));
	}
	@Override
	public String deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		for(Course c:list) {
			if(c.getId()==courseId) {
				list.remove(c);
				return "Found and Removed";
			}
		}
		return "Not Found!";
		
	}
	

}
