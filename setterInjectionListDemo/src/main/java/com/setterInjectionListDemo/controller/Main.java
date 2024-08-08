package com.setterInjectionListDemo.controller;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setterInjectionListDemo.entity.Question;

public class Main {

	public static void main(String[] args) {
//		Resource res = new ClassPathResource("applicationContext.xml");
//		BeanFactory bean = new 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question q1= (Question) context.getBean("a1");
		q1.display();
		
		System.out.println("");
		Question q2= (Question) context.getBean("a2");
		q2.display();
	}

}