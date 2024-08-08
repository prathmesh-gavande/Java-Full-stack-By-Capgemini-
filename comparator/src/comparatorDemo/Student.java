package comparatorDemo;

public class Student {
	
	private int roll;
	private String name;
	private double marks;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int roll, String name, double marks, long contact) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", contact=" + "]";
	}
	

}
