package array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of array: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<len/2;i++) {
			int temp=arr[i];
			arr[i]=arr[len-1];
			arr[len-1]=temp;
		}
		
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}

}
