package array;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in arr1: ");
		int l1=sc.nextInt();
		int arr1[]=new int [l1];
		System.out.println("Enter elements for arr1: ");
		for(int j=0;j<l1;j++) {
			arr1[j]=sc.nextInt();
		}
		
		
		System.out.println("Enter the number of elements in arr2: ");
		int l2=sc.nextInt();
		int arr2[]=new int [l2];
		System.out.println("Enter elements for arr2: ");
		for(int j=0;j<l2;j++) {
			arr2[j]=sc.nextInt();
		}
		
//		int flag=0;
//		for(int i=0;i<l2;i++){
//			for(int j=0;j<l1;j++) {
//				if(arr1[j]==arr2[i]) {
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0) {
//				System.out.print("Not a subset of array");
//				return;
//			}
//		}
//		if(flag!=1) {
//			System.out.print("Not a subset of array");
//		}
//		else {
//			System.out.print("subset of array");
//		}
		//
		int count=0;
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			}
		}
		if(count>=l2)
		{
			System.out.println("Sub");
		}
		else {
			System.out.println("N");
		}

	}

}
