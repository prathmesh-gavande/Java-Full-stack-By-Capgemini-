package com.One_To_Many.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.One_To_Many.entity.Customer;
import com.One_To_Many.entity.Orders;

public class Main {
	
	public static void deleteOrder() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Orders o= session.get(Orders.class, 2);
		if(o==null) {
			System.out.print("order id not found");
		}
		else {
			session.delete(o);
		}
		trans.commit();
		session.close();
		factory.close();
		
	}
	public static void deleteCus() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Customer c= session.get(Customer.class, 1);
		
		if(c==null) {
			System.out.print("Customer id not found");
		}
		else {
			
			 // Delete associated Orders first
	        for (Orders order : c.getOrder()) {
	            session.delete(order);
	        }
	        // Now delete the Customer
	        session.delete(c);
		}
		
		trans.commit();
		session.close();
		factory.close();
	}
	
	public static void  updateorder() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Orders o= session.get(Orders.class, 102);
		
		if(o==null) {
			System.out.print("order id not found");
		}
		else {
			o.setAmount(10000);
			o.setOrder_name("fruits");
	        session.update(o);
		}
		
		trans.commit();
		session.close();
		factory.close();
		
	}
	
	public static void updateCus() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Customer c= session.get(Customer.class, 1);
		
		if(c==null) {
			System.out.print("Customer id not found");
		}
		else {
			c.setName("Parag");
			c.setProfile_no(13255);
			
			session.update(c);
		}
		
		trans.commit();
		session.close();
		factory.close();
	}
	public static void insert() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Customer c1= new Customer(101, "Prathmesh", 12345, null);
		
		Orders o1= new Orders(501, "books", 200.50, null);
		o1.setCust(c1);
		Orders o2= new Orders(502, "toys", 1200.50, null);
		o2.setCust(c1);
		Orders o3= new Orders(503, "cloths", 500.50, null);
		o3.setCust(c1);
		
		List<Orders> l1=new ArrayList<Orders>();
		l1.add(o1);
		l1.add(o2);
		l1.add(o3);
		
		c1.setOrder(l1);
		
		session.save(c1);
		session.save(o1);
		session.save(o2);
		session.save(o3);
		
		trans.commit();
		session.close();
		factory.close();
		
	}
	
	public static void main(String[] args) {
		insert();
//		updateCus();
//		updateorder();
//		deleteCus();
//		deleteOrder();
	}
}
