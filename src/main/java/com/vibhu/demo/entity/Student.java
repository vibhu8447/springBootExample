package com.vibhu.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column
	String name;
    
    @Column
    String school;
    
    @Column
    String division;
    
	public Student( String name, String school, String division) {
		super();
		this.name = name;
		this.school = school;
		this.division = division;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String devision) {
		this.division = devision;
	}
	
	
}
