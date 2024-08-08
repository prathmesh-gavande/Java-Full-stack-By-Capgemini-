package com.synchronization1;

public class Booking extends Thread{
	
	
	

	static double book_seats;
	static double remaining_seats;
	static Inox s;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		s.showExpenses(book_seats);
		System.out.println("********************************************");
	}

	public static void main(String[] args) throws InterruptedException {
		
		s=new Inox();
		
		Booking Paytm=new Booking();
		Paytm.book_seats=20;
		Paytm.start();
		System.out.println("You Booked Ticket: "+book_seats);
		Thread.sleep(1000);
		
		Booking Bank=new Booking();
		Bank.book_seats=30;
		Bank.start();
		System.out.println("You Booked Ticket: "+book_seats);
		Thread.sleep(1500);
		
		Booking Amazon=new Booking();
		Amazon.book_seats=100;
		Amazon.start();
		System.out.println("You Booked Ticket: "+book_seats);
		Thread.sleep(1000);
		

	}

}
