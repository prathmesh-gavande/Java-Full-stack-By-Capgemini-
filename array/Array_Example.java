package com.array;
import java.util.Scanner;

public class Array_Example {

	public static void main(String[] args) {
		int a[]=new int[5];
		int n=a.length;
		a[0]=10;
		a[1]=20;
		
		//For each loop
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n****************************************** ");
		
		System.out.println("\n");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n****************************************** ");
		/*
		int arr[]=new int[5];
		System.out.println("Enter The Array Elements");
		for(int i=0; i<n; i++) {
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
			
		}
		*/
		System.out.println("\n****************************************** ");
		
		char ch[]=new char[5];
		ch[0]='a';
		ch[1]='b';
		
		for(char i:ch) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n****************************************** ");
		/*
		int arr1[]=new int[10];
		System.out.println("Enter the Array Elements");
		Scanner sc1=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			int num=sc1.nextInt();
			
			if(num%2==0) {
				arr1[i]=num;
				i++;
			}
		}
		
		System.out.println("Even Nos are : ");
		for(int i=0; i<10; i++) {
			System.out.println(arr1[i]);
		}
*/
	}

}
