package com.EmployeeRegiHiberMaven.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptable")
public class Employee {
	
	@Id
	@Column(name = "empid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	@Column(name = "fname" , nullable = false)
	private String Fname;
	
	@Column(name = "lname" ,nullable = false)
	private String Lname;
	
	@Column
	private double salary;
	
	@Column(name="emp_contact", unique = true)
	private long contact;
	
	
	public Employee(int empid, String fname, String lname, double salary, long contact) {
		super();
		this.empid = empid;
		Fname = fname;
		Lname = lname;
		this.salary = salary;
		this.contact = contact;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public String getFname() {
		return Fname;
	}
	public String getLname() {
		return Lname;
	}
	public double getSalary() {
		return salary;
	}
	public long getContact() {
		return contact;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", Fname=" + Fname + ", Lname=" + Lname + ", salary=" + salary
				+ ", contact=" + contact + "]";
	}
	
	
}
