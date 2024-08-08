package entity;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private String department;
	private int contact;
	private String email;
	public Student(int roll, String name, int marks, String department, int contact, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.department = department;
		this.contact = contact;
		this.email = email;
	}
	public Student() {
		super();
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getDepartment() {
		return department;
	}
	public int getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", department=" + department
				+ ", contact=" + contact + ", email=" + email + "]";
	}
	
}
