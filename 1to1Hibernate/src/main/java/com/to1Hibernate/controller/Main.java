package com.to1Hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.to1Hibernate.entity.Answer;
import com.to1Hibernate.entity.Question;

public class Main {

	public static void main(String[] args) {
//		insert();
//		delete();
		updateQues();
	}
	public static void updateQues() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory= con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		Question q=session.get(Question.class, 101);
		
		if(q==null) {
			System.out.println("Doctor id not availabel");
		}
		else {
			q.setTotal_marks(100);
			session.update(q);
		}
		
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
		
		Question q1=session.get(Question.class, 101);
		session.delete(q1);
		
		trans.commit();
		session.close();
		factory.close();
	}

	public static void insert() {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

		Question q1 = new Question(101, "What is XML", 10, null);
		Answer a1 = new Answer(501, "extensible markup language", 7, q1);

		q1.setAnswer(a1);
		a1.setQuestion(q1);

		Question q2 = new Question(102, "What is hibernate", 10, null);
		Answer a2 = new Answer(502, "orm tool", 8, q2);

		q2.setAnswer(a2);
		a2.setQuestion(q2);

		session.save(q1);
		session.save(a1);
		session.save(q2);
		session.save(a2);

		trans.commit();
		session.close();
		factory.close();
	}

}
