package com.autoWiringWithAnnotation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int cid;
	private String cname;
	private Person person;
	
	@Autowired
	public Customer (Person person) {
		this.person=person;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
