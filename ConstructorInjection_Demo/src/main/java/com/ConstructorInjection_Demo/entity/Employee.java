package com.ConstructorInjection_Demo.entity;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private int dept_id;
	public Employee(int eid, String ename, double salary, int dept_id) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept_id=" + dept_id + "]";
	}
	
	
}
