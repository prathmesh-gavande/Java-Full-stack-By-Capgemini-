package com.exceptionHandeling;

public class Example1 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[2]=10;
		a[4]=20;
		// a[6]=40;  // it gives error ie exception = Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
		a[4]=50;
		
		try {
			a[6]=90;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		for(int i:a) {
			System.out.print(i+ " ");
		}
	}

}
