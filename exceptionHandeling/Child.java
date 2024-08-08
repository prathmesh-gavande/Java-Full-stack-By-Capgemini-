package com.exceptionHandeling;

import java.io.IOException;

public class Child extends Paranet{
	@Override
	void display() throws Exception{    //Whenever their is overrided method then it cant Throw Check Exception  
		System.out.println("Child Class Method");
	}
	
	public static void main(String[] args) throws Exception{
		Paranet p=new Child();
		try {
			p.display();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Paranet p1=new Paranet();
		try {
			p1.display();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		p.display();
//		Paranet p1=new Paranet();
//		p1.display();
//		Child c=new Child();
//		c.display();
	}
}
