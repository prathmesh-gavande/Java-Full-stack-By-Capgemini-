package array;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the number of rows: ");
//		int row=sc.nextInt();
//
//		System.out.println("Enter the numbers of col: ");
//		int col=sc.nextInt();
//		
//		int arr[][]=new int [row][col];
		
		char  arr[][]=new char [5][5];
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				arr[i][j]='*';
//			}
//		}
		
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==n-1 || i==j  || j==0 ) {
					arr[i][j]='*';
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
