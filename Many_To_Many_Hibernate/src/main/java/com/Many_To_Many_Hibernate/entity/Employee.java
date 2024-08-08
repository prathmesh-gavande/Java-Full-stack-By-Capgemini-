package com.Many_To_Many_Hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int eid;
	@Column
	private String ename;
	@Column
	private String dept;
	 
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Project>projectlist=new ArrayList<Project>();

	public Employee(int eid, String ename, String dept, List<Project> projectlist) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.projectlist = projectlist;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getDept() {
		return dept;
	}

	public List<Project> getProjectlist() {
		return projectlist;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setProjectlist(List<Project> projectlist) {
		this.projectlist = projectlist;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", projectlist=" + projectlist + "]";
	}
	
	
}
