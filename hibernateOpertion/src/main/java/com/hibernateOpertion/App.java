package com.hibernateOpertion;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Patient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		insert();
		delete();
		update();
		read();
    }

	private static void read() {
		
		Transaction transaction = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();

		Patient p=session.get(Patient.class,2);
		
		if(p==null) {
			System.out.println("Patient id does not found...!");
		}
		else {
			System.out.print(p.toString()); 
		}
		transaction.commit();
		session.close();
		
	}

	private static void delete() {
		Transaction transaction = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		Patient p1=new Patient(1,"Parag", 22);
		session.delete(p1);
		transaction.commit();
		session.close();
		
	}

	private static void update() {
		Transaction transaction = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		Patient p1=new Patient(1,"Parag", 22);
		session.update(p1);
		transaction.commit();
		session.close();
		
	}

	private static void insert() {
		
		Transaction transaction = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		Patient p1=new Patient("Prathmesh", 21);
		session.save(p1);
		transaction.commit();
		session.close();
		
	}
    
}
