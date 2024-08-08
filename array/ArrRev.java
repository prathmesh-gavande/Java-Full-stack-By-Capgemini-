package com.array;

import java.util.Scanner;

public class ArrRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe No Of array elements: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
	
		}
		
		
		for(int i=0;i<n/2;i++) {
			int temp=a[i];
			a[i]=a[n-1];
			a[n-1]=temp;
		}
		
		for(int j=0;j<n;j++) {
		System.out.println(a[j]+" ");
		}
	}

}
