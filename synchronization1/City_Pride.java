package com.synchronization1;

public class City_Pride {
	
	static double total_seats=200;
	static double book_seats;
	static double remaining_seats;
	
	synchronized void showExpenses(double book_seats) {
		if(total_seats>book_seats) {
			System.out.println("Seat Book Successfull");
			total_seats=total_seats-book_seats;
			remaining_seats=total_seats;
			System.out.println("Remaining Seats "+remaining_seats);
		}
		else {
			System.out.println("All Seats Are Booked...No Remaining Seats Are Available.");
			throw new InsufficeintSeatException("Check Remaining Seats.");
		}
	}
	
}
