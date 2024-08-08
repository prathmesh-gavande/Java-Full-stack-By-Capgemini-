package com.Many_To_Many_Hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "protable")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	@Column
	private String pname;
	@Column
	private String pdomain;
	
	@ManyToMany(mappedBy = "projectlist")
	private  List<Employee> employees=new ArrayList<Employee>();

	public Project(int pid, String pname, String pdomain, List<Employee> employees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdomain = pdomain;
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getPdomain() {
		return pdomain;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPdomain(String pdomain) {
		this.pdomain = pdomain;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pdomain=" + pdomain + ", employees=" + employees + "]";
	}
	
	
}
