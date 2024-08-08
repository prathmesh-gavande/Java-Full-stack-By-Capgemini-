package com.array;

public class Arr5 {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5};
		
		arr[1]=arr[5]*10;
		arr[3]=arr[0]/5;
		arr[4]=arr[2]+50;
		
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);
		}

	}

}
