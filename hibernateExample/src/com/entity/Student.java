package com.entity;

public class Student {
	private int sid;
	private String name;
	private double marks;
	private long contact;
	
	
	
	public Student(int sid, String name, double marks, long contact) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.contact = contact;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public long getContact() {
		return contact;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", contact=" + contact + "]";
	}
	
	
	
}
