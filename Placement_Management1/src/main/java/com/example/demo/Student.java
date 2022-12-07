package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private Integer id;
	private String name;
	private Integer rollno;
	private String qualification;
	private String course;
	private Integer year;
	private Integer hallticketno;

	//default constructor
	public Student() {
		super();	
	}
	
	//parameterized constructor

	public Student(int id, String name, int roll, String qualification, String course, int year, int halltikitno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticketno = halltikitno;
	}
	//setters and getters method

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

	public int getRoll() {
		return rollno;
	}

	public void setRoll(int roll) {
		this.rollno = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHalltikitno() {
		return hallticketno;
	}

	public void setHalltikitno(int halltikitno) {
		this.hallticketno = halltikitno;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", roll=" + rollno + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", halltikitno=" + hallticketno + "]";
	}
	
	

}
