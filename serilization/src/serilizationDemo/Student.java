package serilizationDemo;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int roll;
	private String name;
	private String username;
	transient private String password;
	
	public Student(int roll, String name, String username, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getusername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + username + ", password=" + password + "]";
	}
	
}
