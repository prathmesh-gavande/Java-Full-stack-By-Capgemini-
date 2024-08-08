package com.multithreading;

public class OneThread_MultipleTask implements Runnable {
	
	int a=40;
	int b=10;
	
	@Override
	public void run() {
		
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
	}
	
	void addition() {
		System.out.println("Addition: "+(a+b));
	}
	
	void subtraction() {
		System.out.println("Subtraction: "+(a-b));
	}
	
	void multiplication() {
		System.out.println("Multiplication: "+(a*b));
	}
	void division() {
		System.out.println("division: "+(a/b));
	}
	
	void modulus() {
		System.out.println("Modulus: "+(a%b));
	}
	
	public static void main(String[] args) {
		System.out.println("Main Thread Is Running");
		
		OneThread_MultipleTask ot=new OneThread_MultipleTask();
		Thread t=new Thread(ot);
		t.start();
	}

}
