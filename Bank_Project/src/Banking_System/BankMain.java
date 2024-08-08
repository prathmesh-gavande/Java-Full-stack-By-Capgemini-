package Banking_System;

import java.util.Scanner;


public class BankMain {
	
	public static void validation() {
		Scanner sc =new Scanner(System.in);
		String fixUsername="prathmesh";
		String fixpass="1234";
		
		System.out.println("Enter username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter the password: ");
		String password=sc.nextLine();
		
		try {
			if(password.equals(fixpass) && username.equals(fixUsername)) {
				System.out.println(" Login successfully.... ");
				
//				System.out.print("this is inrichable statement");  //syntax error 
				
			}else {

				throw new PasswordValidation("Wrong username and  Password  ..!");
			}
		}catch (PasswordValidation e){
			e.printStackTrace();
			
		}
	}
	
	public static void withdrawal() {
		int balance=5000;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the amount for withdraw: ");
		int amount=sc.nextInt();
		
		
		try {
			if(amount > balance) {
				
				throw new BalanceCheckException("Insufficient Balance ... .");
				
			}else {
				balance+=amount;
				
			}
		}catch (BalanceCheckException e){
			e.printStackTrace();
			
		}
		System.out.println("Balance: "+balance);
		
	}
	
	public static void Deposit(int amount) {
		
	}
	
	public static void  deposit() {
		
	}
	
	public static void main(String[] args) {
		validation();
		withdrawal();
		
		
		System.out.println("Exception handled ..  ");
	}

}
