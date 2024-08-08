package array;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of subjects: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the marks of each subject: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("Avg: "+sum/len);

	}

}
