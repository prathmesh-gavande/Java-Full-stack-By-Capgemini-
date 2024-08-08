package com.exceptionHandeling;

import java.util.Scanner;

public class PasswardValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String Password=sc.next();
		String SetPassword="1234";
		String Setusername="Parag";
		System.out.println("Enter Your User Name");
		String UserName=sc.next();
		
		
		try {
			if(SetPassword.equals(Password) && Setusername.equals(UserName)) {
				System.out.println("Your Password and User Name Is Right ");
				System.out.println("Well Done ..!");
			}
			else {
				throw new PasswordValidationException("Your Password and User Name Is Incorrect PLz Try Again ");
			}
			}catch(PasswordValidationException e) {
				e.printStackTrace();
			}
			System.out.println("Exception Handled");
			


	}

}
