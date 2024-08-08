package com.ConstructorInjection_Demo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ConstructorInjection_Demo.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		//************************ Contructor based injection ********************
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee)context.getBean("e1");
		System.out.println(emp.toString());
		
		Employee emp2 = (Employee)context.getBean("e2");
		System.out.println(emp2.toString());

	}

}
