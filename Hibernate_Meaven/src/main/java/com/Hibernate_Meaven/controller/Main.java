package com.Hibernate_Meaven.controller;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate_Meaven.entity.Customer;
import com.mysql.cj.Query;


public class Main {

	public static void main(String[] args) {
		
//		insert();
//		delete();
//		update();
//		read();
		readAll();

	}
	public static void insert() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory factory=con.buildSessionFactory();
		Session session= factory.openSession();
		Transaction trans=session.beginTransaction();
		

		Customer c=new Customer(1, "Prathmesh", 200, "MH398081");
		Customer c1=new Customer(2, "Parag", 520, "MH398441");
		Customer c2=new Customer(3, "ram", 500, "MH398681");
		
		session.save(c); 
		session.save(c1); 
		session.save(c2); 
		trans.commit();
		
		session.close();
		factory.close();
	}
	public static void delete() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Customer c=session.get(Customer.class, 1);
		
		if(c==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			session.delete(c);
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
		
		Customer c=session.get(Customer.class,2);
		
		if(c==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			Session session1= fact.openSession();
			Transaction trans1=session1.beginTransaction();
			Customer c1=new Customer(2, "Parag", 5520, "MH398441");
			session1.update(c1);
			trans1.commit();
			session1.close();
		}
		trans.commit();
		session.close();
	}
	
	public static void read() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Customer c=session.get(Customer.class,2);
		
		if(c==null) {
			System.out.println("Student id does not found...!");
		}
		else {
			System.out.print(c.toString()); 
		}
		trans.commit();
		session.close();
	}
	public static void readAll() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session= fact.openSession();
		Transaction trans=session.beginTransaction();
		org.hibernate.query.Query query=session.createQuery("From  Customer");
		
		List<Customer> cust=query.list();
		for(Customer customer:cust) {
			System.out.print("id: "+customer.getCid());
			System.out.print("  Name: "+customer.getName());
			System.out.print("  Amount: "+customer.getAmount());
			System.out.print("  vehical_no: "+customer.getVehical_no());
			System.out.println();
		}
		
	}

}
