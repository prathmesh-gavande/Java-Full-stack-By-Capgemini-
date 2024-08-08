package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(nullable = true)
	private String name;
	@Column
	private String email;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Admin(int aid, String name, String email) {
		super();
		this.aid = aid;
		this.name = name;
		this.email = email;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
