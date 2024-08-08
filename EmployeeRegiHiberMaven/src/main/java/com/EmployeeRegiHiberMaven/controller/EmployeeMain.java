package com.EmployeeRegiHiberMaven.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EmployeeRegiHiberMaven.entity.Employee;


public class EmployeeMain {

	public static void insert() {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

		Employee e = new Employee(101, "Prathmesh", "gavande", 25000, 123456789);
		Employee e1 = new Employee(102, "Parag", "gavande", 55000, 1256789);
		Employee e2 = new Employee(103, "ram", "gavande", 27000, 1234589);
		Employee e3 = new Employee(104, "shyam", "gavande", 244000, 12345789);

		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);

		trans.commit();

		session.close();
		factory.close();

	}

	public static void delete() {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

		Employee e = session.get(Employee.class, 4);

		if (e == null) {
			System.out.println("Employee id does not found...!");
		} else {
			session.delete(e);
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
		
		Employee e=session.get(Employee.class,2);
		
		if(e==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			Session session1= fact.openSession();
			Transaction trans1=session1.beginTransaction();
			Employee e1=new Employee(2, "shyam", "gavande", 244000, 12345789);
			session1.update(e1);
			trans1.commit();
			session1.close();
		}
		trans.commit();
		session.close();
	}

	public static void main(String[] args) {
//		insert();
//		delete();
		update();

	}

}
