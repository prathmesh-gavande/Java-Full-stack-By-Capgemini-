package test.entity;

public class Student {
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
