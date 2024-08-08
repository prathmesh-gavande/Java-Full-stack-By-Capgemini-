package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.EmployeeDao;
import entity.Employee;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("welcomen to JDBC !..");
			System.out.println("*****************************");
			System.out.println("Press 1 for insert ");
			System.out.println("Press 2 for Delete");
			System.out.println("press 3 for Update");
			System.out.println("press 4 for Read");
			System.out.println("press 5 for Exit");
			
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter Employee Id: ");
				int emp_id=sc.nextInt();
				
				System.out.println("Enter Employee name: ");
				String emp_name=sc.next();
				
//				System.out.println("Enter Image path: ");
//				Blob image=sc.next()
				
				Employee e= new Employee(emp_id, emp_name,null);
				
				EmployeeDao.insert(e);
				
			}
			else if (choice==2) {
				System.out.println("*****************************");
				System.out.println("Enter id: ");
				int emp_id=sc.nextInt();
				EmployeeDao.delete(emp_id);
				
			}
			else if (choice==3) {
				System.out.println("*****************************");
				System.out.println("Enter id to update: ");
				int emp_id=sc.nextInt();
				System.out.println("Enter new employee name: ");
				String name=sc.next();
				Employee e=new Employee(emp_id, name, null);
				EmployeeDao.update(e);
				
			}	
			else if(choice==4) {
				System.out.println("*****************************");
				System.out.println("Enter id : ");
				int emp_id=sc.nextInt();
				EmployeeDao.read(emp_id);
			}
			else {
				break;
			}
		}
		
	}

}
