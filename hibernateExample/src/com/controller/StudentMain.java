package com.controller;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentMain {

	public static void main(String[] args) {
//		insert();
//		delete();
		update();
//		viewAll();
	}
	
	public static void insert() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory factory=con.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trans=session.beginTransaction();
		
//		Student std=new Student(101, "Prathmesh", 10.11, 454232);
//		session.save(std);           // use in old version now days use persist
		
		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student ID (or type 'exit' to quit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int id = Integer.parseInt(input);

            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            System.out.println("Enter student marks:");
            double marks = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter student contact number (as long):");
            long contact = Long.parseLong(scanner.nextLine());

            Student std = new Student(id, name, marks, contact);
            session.save(std); 
            
        }
		
//		Student std1=new Student(105, "ram", 89.40, 127545);
//		session.save(std1); 
//		session.persist(std);
//		trans.commit();
		
		session.close();
		factory.close();
	}
	
	public static void delete() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Student std=session.get(Student.class, 4);
		
		if(std==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			session.delete(std);
		}
		trans.commit();
		session.close();
	}
	
	public static void update() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Student std=session.get(Student.class,5);
		
		if(std==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			SessionFactory fact1=con.buildSessionFactory();
			Session session1= fact1.openSession();
			Transaction trans1=session1.beginTransaction();
			Student std1=new Student(5, "sandip", 100.40, 127545);
			session1.update(std1);
			trans1.commit();
			session1.close();
		}
		trans.commit();
		session.close();
	}
	
	public static void viewAll() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Student std=session.get(Student.class,11);
		
		if(std==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			System.out.print(std.toString());
		}
		trans.commit();
		session.close();
	}
	

}
