package com.exceptionHandeling;

public class Example3 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {          // in this example execute this catch block because we know that which type of exception this is so we hande it first 
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Programm Completed");
		
		
		System.out.println("*****************************");
		
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(Throwable e) {         //in this this catch block is execute because we dont know the exact exception so Throwable class automatically catageriose the perfect exception 
			e.printStackTrace();      // So Throwable Class is always written at last Catch Block  because of Hierarchy of Exception 
		}
		
		System.out.println("Programm Completed");

	}

}
