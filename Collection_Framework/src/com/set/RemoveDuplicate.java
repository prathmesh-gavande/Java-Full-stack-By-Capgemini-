package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[]= {10,80,30,80,50,30,70,10,50,40,40};
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			arr.add(a[i]);
		}
		System.out.println("Before Removal: "+arr);
		
		LinkedHashSet<Integer>lset5=new LinkedHashSet<Integer>(arr);
		System.out.println("After Removal: "+lset5);
		
	}

}
