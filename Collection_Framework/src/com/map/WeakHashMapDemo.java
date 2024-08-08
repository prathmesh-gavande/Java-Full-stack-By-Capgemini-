package com.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	/*
	 1)Does Not allow duplicate value
	 2)null values are automitiacally handle by garbage collection 
	 3)it is non synchronize 
	 3)initial capacity is 16 byte
	 4)capacity is increased by 0.75
	 */

	public static void main(String[] args) {
		WeakHashMap<Integer, String> wm=new WeakHashMap<Integer, String >();
		
		wm.put(1, "Parag");
		wm.put(2, "Yash");
		wm.put(null, null);
		wm.put(4, null);
		wm.put(null, "Rudra");
		wm.put(null, "Parag");
		
		
		System.out.println(wm);
		System.gc();
		System.out.println(wm);
		
		

	}

}
