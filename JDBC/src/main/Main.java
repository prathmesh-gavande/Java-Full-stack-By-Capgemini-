package main;
import java.sql.SQLException;
import java.util.Scanner;

import entity.ConnectorClass;
import entity.Customer;
import dao.CustomerDao;
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
				System.out.println("Enter the Customer ID: ");
				int cid=sc.nextInt();
				
				System.out.println("Enter the Customer Name: ");
				String cname=sc.next();
				
				System.out.println("Enter the amount: ");
				double amount=sc.nextDouble();
				
				System.out.println("Enter the Bill Number: ");
				int bill_no=sc.nextInt();
				
				Customer c=new Customer(cid, cname, amount, bill_no);
				
				int  result=CustomerDao.insert(c);
				if(result>0) {
					System.out.println("Data inserted");
				}else {
					System.out.println("Something went wrong!");
				}
				System.out.println("*****************************");
			}
			else if (choice==2) {
				System.out.println("*****************************");
				System.out.println("Enter the customer id: ");
				int cid=sc.nextInt();
				CustomerDao.delete(cid);
				
			}
			else if (choice==3) {
				System.out.println("*****************************");
				System.out.println("Enter the Customer id to upadate: ");
				int cid=sc.nextInt();
				
				System.out.println("Enter Name: ");
				String cname=sc.next();
				
				System.out.println("Enter Amount: ");
				Double amount=sc.nextDouble();
				
				System.out.println("Enter Bill Number: ");
				int  bill_no=sc.nextInt();
				
				Customer c=new Customer(cid, cname, amount, bill_no);
				
				CustomerDao.update(c);
				
			}
			else if(choice==4) {
				System.out.println("*****************************");
				CustomerDao.read();
			}
			else{
				System.out.println("*****************************");
				System.out.println("Thank you !..");
				break;
			}
			
		}
		
	}
}
