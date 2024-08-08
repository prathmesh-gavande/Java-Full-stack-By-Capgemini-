package entity;

import java.sql.Blob;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private Blob image;
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", image=" + image + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public Blob getImage() {
		return image;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public Employee() {
		super();
	}
	public Employee(int emp_id, String emp_name, Blob image) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.image = image;
	}

}
