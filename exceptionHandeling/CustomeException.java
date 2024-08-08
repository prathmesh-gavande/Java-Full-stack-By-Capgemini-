package com.exceptionHandeling;

public class CustomeException {
	
	public static void marksValidation(double marks) {
		if(marks<40) {
			throw new ArithmeticException("You are Fail plz Try Again");
		}
		else {
			System.out.println("You have Passed the Exam.");
		}
	}

	public static void main(String[] args) {
		marksValidation(39);
	}
	

}
