package com.exceptionHandeling;

public class Example2 {

	public static void main(String[] args) {
		
		int a=0, b=10, c=50;
		
		//System.out.println(b/a); 	// This will give Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		try {
			System.out.println(b/a);
			try {
				String s=null;
				System.out.println(s.length());
			}catch(Exception e) {
				System.out.println(e);
			}
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("This Program Is Completed.");
		
		
		
		

	}

}
