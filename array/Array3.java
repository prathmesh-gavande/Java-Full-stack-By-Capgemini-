package com.array;

public class Array3 {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		
		//For each loop
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.print(i+" ");
			}
		}

	}
}
