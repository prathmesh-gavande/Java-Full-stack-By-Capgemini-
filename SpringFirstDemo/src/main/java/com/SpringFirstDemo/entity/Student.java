package com.SpringFirstDemo.entity;

public class Student {
	private int sid;
	private String sname;
	private double smarks;
	private long contact;
	public Student(int sid, String sname, double smarks, long contact) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.contact = contact;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public double getSmarks() {
		return smarks;
	}
	public long getContact() {
		return contact;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", contact=" + contact + "]";
	}
	
	
}
