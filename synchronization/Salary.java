package com.synchronization;

public class Salary {
	
	static double total_salary=30000;
	static double expenses;
	static double remaining;
	
	synchronized void showExpenses(double expenses) {
		if(total_salary>expenses) {
			System.out.println("Payement Successfull");
			total_salary=total_salary-expenses;
			remaining=total_salary;
			System.out.println("Remaining Amount "+remaining);
		}
		else {
			System.out.println("Insufficient Funds ....Try Again");
			throw new InsufficientFundsException("Check Your Balance...!");
		}
	}

	

}
