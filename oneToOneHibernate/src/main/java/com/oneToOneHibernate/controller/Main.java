package com.oneToOneHibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oneToOneHibernate.entity.Doctor;
import com.oneToOneHibernate.entity.Patient;

public class Main {

	public static void main(String[] args) {
		
//		insert();
		updateDoctor();

	}
	
	public static void delete() {
		
	}
	
	public static void updateDoctor() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Doctor d=session.get(Doctor.class, 101);
		
		if(d==null) {
			System.out.println("Doctor id not availabel");
		}
		else {
			d.setContact(123414234);
			d.setDname("parag");
			session.update(d);
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
		
		Doctor d1= new Doctor(101, "prathmesh", "wetarnary", 1234567, null);
		Patient p1= new Patient(501, "shyam", "fever", null,82674222);
		
		d1.setAppointed_patient(p1);
		p1.setApointed_doctor(d1);
		
		Doctor d2= new Doctor(102, "ram", "ortho", 1234647, null);
		Patient p2= new Patient(502, "parag", "pain in neck", null,821234222);
		
		d2.setAppointed_patient(p2);
		p2.setApointed_doctor(d2);
		
		session.save(d1);
		session.save(p1);
		session.save(d2);
		session.save(p2);
		
		trans.commit();
		session.close();
		factory.close();
	}
}
