package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	private long contact;
	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public long getContact() {
		return contact;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Employee(int emp_id, String emp_name, double emp_salary, long contact) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", contact="
				+ contact + "]";
	}
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.emp_id-o.emp_id;
//	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)this.emp_salary- (int)o.emp_id;
	}
	
//	public static void main(String[] args) {
//		ArrayList<Integer> emps_no=new ArrayList<Integer>();
//		emps_no.add(1001);
//		emps_no.add(1005);
//		emps_no.add(1002);
//		emps_no.add(605);
////		emps_no.add(null);     //Null is not allowed
//		emps_no.add(050);
//		
//		System.out.println(emps_no);
//		Collections.sort(emps_no);
//		System.out.println(emps_no);
//	}

}
