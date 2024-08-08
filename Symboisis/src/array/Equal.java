package array;

import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int row=sc.nextInt();

		
		int arr1[]=new int [row];
		int arr2[]=new int [row];
		
		System.out.println("Enter elements for arr1: ");
			for(int j=0;j<row;j++) {
				arr1[j]=sc.nextInt();
			}
		
		System.out.println("Enter elements for arr2: ");
			for(int j=0;j<row;j++) {
				arr2[j]=sc.nextInt();
			}
		
		for(int i=0;i<row;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.print("False");
				return ;
			}
		}
		System.out.print("True");

	}

}
