package com.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String empid;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String address;
	private String contact;
	
	
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(String empid, String firstName, String lastName, String userName, String password, String address,
			String contact) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}




	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", address=" + address + ", contact=" + contact + "]";
	}

	
	
}
