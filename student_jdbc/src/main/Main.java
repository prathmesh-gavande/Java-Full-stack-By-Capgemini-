package main;

import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentDao;
import entity.Student;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		ConnectorClass.createConnection();
		
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
				System.out.println("*****************************");
				System.out.println("Enter Student Roll Number: ");
				int roll=sc.nextInt();
				
				System.out.println("Enter Sudent Name: ");
				String name=sc.next();
				
				System.out.println("Enter Student Marks: ");
				int marks=sc.nextInt();
				
				System.out.println("Enter Student Department: ");
				String department=sc.next();
				
				System.out.println("Enter Student Contact Number: ");
				int contact=sc.nextInt();
				
				System.out.println("Enter Student Email: ");
				String email=sc.next();
				
				Student st=new Student(roll,name,marks,department,contact,email);
				
				int result=StudentDao.insert(st);
				if(result>0) {
					System.out.println("Data inserted");
				}else {
					System.out.println("Something went wrong!");
				}
				System.out.println("*****************************");
				
				
			}else if(choice==2) {
				System.out.println("*****************************");
				System.out.println("Enter Student Roll Number: ");
				int roll=sc.nextInt();
				StudentDao.delete(roll);
			}else if (choice==3) {
				System.out.println("*****************************");
				System.out.println("Enter Student Roll Number: ");
				int roll=sc.nextInt();
				
				System.out.println("Enter Sudent Name: ");
				String name=sc.next();
				
				System.out.println("Enter Student Marks: ");
				int marks=sc.nextInt();
				
				System.out.println("Enter Student Department: ");
				String department=sc.next();
				
				System.out.println("Enter Student Contact Number: ");
				int contact=sc.nextInt();
				
				System.out.println("Enter Student Email: ");
				String email=sc.next();
				
				Student st=new Student(roll,name,marks,department,contact,email);
				
				StudentDao.update(st);
				
			}else if (choice==4) {
				System.out.println("*****************************");
				StudentDao.read();
			}else {
				System.out.println("*****************************");
				System.out.println("Thank you !..");
				break;
			}
		}
	}

}
