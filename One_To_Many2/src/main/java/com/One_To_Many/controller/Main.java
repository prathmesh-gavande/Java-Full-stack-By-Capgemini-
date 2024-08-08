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
	
	
	public static void insert() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Customer c1= new Customer(101, null);
		
		Orders o1= new Orders(501, null);
		o1.setCust(c1);
		Orders o2= new Orders(502, null);
		o2.setCust(c1);
		Orders o3= new Orders(503,null);
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
	}
}
