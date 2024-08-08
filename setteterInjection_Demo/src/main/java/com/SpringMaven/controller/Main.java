package com.SpringMaven.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringMaven.entity.Customer;

public class Main {

	public static void main(String[] args) {
		ApplicationContext application= new ClassPathXmlApplicationContext("applcationContext.xml");
		Customer c= (Customer)application.getBean("s1");
		
		System.out.println(c.toString());
	}

}
