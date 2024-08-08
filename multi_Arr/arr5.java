package com.multi_Arr;

import java.util.Scanner;

public class arr5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe No Of Rows in array One : ");
		int row1=sc.nextInt();
		System.out.println("Enter THe No Of Elements in array One : ");
	
		int arr1[]=new int[row1];

		for(int i=0; i<row1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter THe No Of Rows in array Two : ");
		int row2=sc.nextInt();
		System.out.println("Enter THe No Of Elements in array Two : ");
	
		int arr2[]=new int[row2];
		
		
		for(int i=0;i<row2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<row1;i++) {
			if(arr1[i] != arr2[i]) {
				return ;
			}
		}
		System.out.println("True");
		
		
		
		
		
		
	}

}
