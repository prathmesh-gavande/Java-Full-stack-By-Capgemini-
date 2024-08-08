package com.exceptionHandeling;

import java.util.Scanner;

public class CustomeException11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		
		int Age=sc.nextInt();
		
		if(Age<18) {
			throw new AgeValidationException1("You Are Not Eligible ");
			
		}
		else {
			System.out.println("Your Are eligible for Vote");
		}
		
	}

}
