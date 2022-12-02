package com.example.demo;

import org.springframework.stereotype.Component;

/* This is used to denote the class is component
 * It allows the automatically our custom beans*/

@Component
public class Student {
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() 
	{
		System.out.println("Welcome to Java Full Stack");
	
	}
	public Student() {
		super();
		System.out.println("Welcome to M25 Batch");
	}
	

}
