package com.AutoWiringSpring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AutoWiringSpring.entity.ComputerEngineer;
import com.AutoWiringSpring.entity.Engineer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Engineer e1=context.getBean("e",Engineer.class);
		
		e1.display();

		ComputerEngineer c1=context.getBean("c",ComputerEngineer.class);
	}

}
