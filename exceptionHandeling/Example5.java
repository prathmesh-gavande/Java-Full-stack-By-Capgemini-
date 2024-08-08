package com.exceptionHandeling;

public class Example5 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[3];
			System.out.println(a[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {									//If their is no catch block then their is always finally block & it is Always occur & it is place always at the 
			System.out.println("Finally Block");	//end of the program & it is use because we want  the condition which we want to execute at any cost 
		}

	}

}
