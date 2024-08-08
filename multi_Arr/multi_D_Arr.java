package com.multi_Arr;
import java.util.Scanner;

public class multi_D_Arr {

	public static void main(String[] args) {
		/*  How to declair array 
		int a[][];  or
		int[]a[];  or
		int [][]a;
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe No Of Rows: ");
		int n=sc.nextInt();
		System.out.println("Enter THe No Of Columns: ");
		int m=sc.nextInt();
		
		System.out.println("Enter THe Array Elements: ");
		
		int arr[][]=new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Your Array Elements Are: ");
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(" *******************************************************************");
		
		System.out.println("Transpose Matrix Is: ");
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(" *******************************************************************");
		System.out.println("Triangular Pattaern: ");
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<=i; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(" *******************************************************************");
		System.out.println("Hollow Triangular Pattaern: ");
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<=i; j++) {
				
				if(i==j || (j==0 ) || i==n-1){
					System.out.print(arr[i][j]+ " ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		

	}

}
