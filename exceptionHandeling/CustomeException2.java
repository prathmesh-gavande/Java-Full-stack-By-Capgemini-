package com.exceptionHandeling;
import java.util.Scanner;

public class CustomeException2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		
		int Age=sc.nextInt();
		try {
		if(Age<18) {
			throw new AgeValidationException1("You Are Not Eligible ");
			// System.out.println("12345");         // gives error 
		}
		else {
			System.out.println("Your Are eligible for Vote");
			System.out.println("12345");
		}
		}catch(AgeValidationException1 e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
		

	}

}
