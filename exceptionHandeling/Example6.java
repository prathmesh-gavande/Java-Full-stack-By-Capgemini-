package com.exceptionHandeling;

public class Example6 {
	
	public static void ageValidation(int age) {
		if(age<18) {
			throw new NullPointerException("Your age not valid Plz try again");
		}
		else {
			System.out.println("Your age valid.");
		}
	}


	public static void main(String[] args) {
		
		ageValidation(17);
	}

}
