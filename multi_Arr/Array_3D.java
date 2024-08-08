package com.multi_Arr;

import java.util.Scanner;

public class Array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter THe No Of Rows: ");
		int n=sc.nextInt();
		System.out.println("Enter THe No Of Columns: ");
		int m=sc.nextInt();
		System.out.println("Enter THe No Of Depth: ");
		int l=sc.nextInt();
		System.out.println("Enter THe No Of 4th Dimention: ");
		int p=sc.nextInt();
		
//		System.out.println("Enter THe Array Elements: ");
//		
//		int arr[][][]=new int[n][m][l];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				for(int k=0; k<l; k++) {
//					arr[i][j][k]=sc.nextInt();
//				}
//			}
//		}
//		
//		System.out.println("Your Array Elements Are: ");
//		
//		for(int i=0; i<n; i++) { 
//			for(int j=0; j<m; j++) {
//				for(int k=0;k<l;k++) {
//					System.out.print(arr[i][j][k]+ " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		
		System.out.println("*****************************************************************************************");
		System.out.println("4D Array: ");
		
		
		System.out.println("Enter THe Array Elements: ");
		
		int arr1[][][][]=new int[n][m][l][p];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<l;k++) {
					for(int h=0;h<p;h++) {
						arr1[i][j][k][h]=sc.nextInt();
					}
				}
			}
		}
		
//		
		System.out.println("Your Array Elements Are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<l;k++) {
					for(int h=0;h<p;h++) {
						System.out.print(arr1[i][j][k][h]+ " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
