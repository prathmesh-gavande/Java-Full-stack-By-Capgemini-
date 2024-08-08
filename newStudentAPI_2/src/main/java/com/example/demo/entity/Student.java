package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stdtable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	@Column
	private String name;
	@Column
	private double marks;
	@Column
	private String email;
	@Column
	private long contact;
	public Student(int roll, String name, double marks, String email, long contact) {
		super();
		this.name = name;
		this.marks = marks;
		this.email = email;
		this.contact = contact;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + ", contact="
				+ contact + "]";
	}
	
	
}

// customer int cid, string name,String bill_no ,double amount, string vehicle_no, long contact
