package com.BankException;

import java.util.Scanner;

import com.exceptionHandeling.PasswordValidationException;

public class BankMain {
	static float balance=10000;
	
	public static void withdrawal(float amount) {
		//float balance=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Amount You Have To Withdraw: ");
		float withdraw=sc.nextFloat();
		
		if(balance<withdraw) {
			throw new  WithdrawException("Insufficient Amount Of Balance");
		}
		else {
			balance-=withdraw;
			System.out.println("Balance :"+balance);
		}
		
		
	}
	

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
				throw new PassWordValidationException("Your Password and User Name Is Incorrect PLz Try Again ");
			}
		}catch(PasswordValidationException e) {
			e.printStackTrace();
		}
			
		withdrawal(500);
		
		System.out.println("Exception Handled");

	}

}
