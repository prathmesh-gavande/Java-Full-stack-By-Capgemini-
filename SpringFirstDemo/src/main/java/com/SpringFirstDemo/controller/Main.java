package com.SpringFirstDemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFirstDemo.entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std=(Student) context.getBean("S1");
		
		System.out.println(std.toString());
		
		Student std2=(Student) context.getBean("S2");
		
		System.out.println(std2.toString());
	}

}
