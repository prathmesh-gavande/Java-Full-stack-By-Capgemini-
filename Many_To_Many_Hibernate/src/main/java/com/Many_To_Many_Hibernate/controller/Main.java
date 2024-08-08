package com.Many_To_Many_Hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Many_To_Many_Hibernate.entity.Employee;
import com.Many_To_Many_Hibernate.entity.Project;

public class Main {
	
	public static void update() {
		
	}
	
	public static void insert() {
	    Configuration con = new Configuration();
	    con.configure("hibernate.cfg.xml");
	    
	    SessionFactory factory = con.buildSessionFactory();
	    Session session = factory.openSession();
	    Transaction trans = session.beginTransaction();
	    
	    Employee e1 = new Employee(101, "Prathmesh", "QA", null);
	    Project p1 = new Project(501, "web app development", "banking", null);
	    
	    Employee e2 = new Employee(102, "Parag", "HR", null);
	    Project p2 = new Project(502, "android development", "Medical", null);
	    
	    
	    
	    List<Project> projectlist = new ArrayList<>();
	    projectlist.add(p1);
	    projectlist.add(p2);
	    
	    List<Employee> employeelist = new ArrayList<>();
	    employeelist.add(e1);
	    employeelist.add(e2);
	    
	    e1.setProjectlist(projectlist);
	    e2.setProjectlist(projectlist);
	    p1.setEmployees(employeelist);
	    p2.setEmployees(employeelist);
	    
	    session.save(e1);
	    session.save(e2);
	    session.save(p1);
	    session.save(p2);
	    
	    
	    
	    trans.commit();
	    session.close();
	    factory.close();
	}

	public static void main(String[] args) {
//		insert();
	}

}
