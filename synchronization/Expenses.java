package com.synchronization;

public class Expenses extends Thread{
	
	static double expenses;
	static double remaining;
	static Salary s;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		s.showExpenses(expenses);
		System.out.println("********************************************");
	}

	public static void main(String[] args) throws InterruptedException {
		
		s=new Salary();
		
		Expenses traveling=new Expenses();
		traveling.expenses=3500;
		traveling.start();
		Thread.sleep(1000);
		
		Expenses Food=new Expenses();
		Food.expenses=4000;
		Food.start();
		Thread.sleep(1500);
		
		Expenses Accomodation=new Expenses();
		Accomodation.expenses=5000;
		Accomodation.start();
		Thread.sleep(1000);
		
		Expenses Medical=new Expenses();
		Medical.expenses=2000;
		Medical.start();
		Thread.sleep(2000);
		
		Expenses Charaty=new Expenses();
		Charaty.expenses=1000;
		Charaty.start();
		Thread.sleep(2000);

	}
}
