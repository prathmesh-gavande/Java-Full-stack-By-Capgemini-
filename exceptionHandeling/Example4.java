package com.exceptionHandeling;

public class Example4 {

	public static void main(String[] args) {
		
		try {
			System.out.println(50/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
			try {
				String s=null;
				System.out.println(s.length());
			}catch(Throwable t) {
				System.out.println(t);
			}
			
		}
		System.out.println("Exception Handled By User");

	}

}
