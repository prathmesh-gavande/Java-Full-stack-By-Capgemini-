package com.array;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe No Of Subject: ");
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[5];
		System.out.println("Enter Marks Of Subject: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum/n);
		
		
		sc.close();// it is used to close the Scanner Class and use to free te memory occupied by object it is not mandatory 
	}
	
	
	

}
