package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	@Column
	private String name;
	@Column
	private  double marks;
	@Column
	private String email;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int roll, String name, double marks, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
