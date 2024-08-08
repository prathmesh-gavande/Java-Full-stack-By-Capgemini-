package com.multi_Arr;

import java.util.Scanner;

public class arr6 {
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
		int flag=0;
		int k=0;
		while(k<row1) {
			if(arr1[k] != arr2[k]) {
				flag =1;
				break;
			}
			k++;
		}
		if(flag==0) {
			System.out.println(" Subarray ");
		}
		else {
			System.out.println(" Not Subarray ");
		}
		
	}
}
