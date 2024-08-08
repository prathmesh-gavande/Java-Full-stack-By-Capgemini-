package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_obj {
	public static void  main(String[]arr) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1001, "Prathmesh",40000, 123456789));
		emp.add(new Employee(5001, "Parag",400000, 16335333));
		emp.add(new Employee(501, "Ram",50000, 830156789));
		emp.add(new Employee(1231, "Shyam",100000, 65386789));
		emp.add(new Employee(11, "rohan",10000000, 123226789));
		System.out.println(emp);
		System.out.println("=============================================");
		System.out.println(emp.toString());  //valid for only if creates toString in Employee Class
		System.out.println("=============================================");
		for(Employee i: emp) {
			System.out.println("========================================");
			System.out.println(i.getEmp_id()+" "+i.getEmp_name()+" "+ i.getEmp_salary()+" "+i.getContact());
		}
		System.out.println("*********************************************");
		Collections.sort(emp);
		System.out.println("Sorted List");
		for(Employee i: emp) {
			System.out.println("========================================");
			System.out.println(i.getEmp_id()+" "+i.getEmp_name()+" "+ i.getEmp_salary()+" "+i.getContact());
		}
	}
}
