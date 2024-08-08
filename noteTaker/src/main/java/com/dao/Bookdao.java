package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Book;

public class Bookdao {
	
	@SuppressWarnings("deprecation")
	public static boolean save(Book book) {
		Transaction transaction=null;
		Session session =HibernateConfiguration.getSessionFactory().openSession();
		 transaction= session.beginTransaction();
		
		session.save(book);
		transaction.commit();
		session.close();
		
		return false;
		
	}
}
