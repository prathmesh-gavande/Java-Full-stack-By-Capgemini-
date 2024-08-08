package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	/*
	1) linkedHashmap=linkedlist + Hashmap
	2) it implements hashtable
	3) it contains only unique values
	4)linked hashmap is non synchronus
	5) it allows only one null key, but values can have multiple null
	6) initial capacity is 16 & its load factor is 0.75
	7)it maintains insertion order
	 */
	
	
	public static void main(String[] args) {
	
		LinkedHashMap<Integer,String>lh=new LinkedHashMap<Integer,String>();
		lh.put(101, null);
		lh.put(102, "Parag");
		lh.put(103, null);
		lh.put(101, "Yash");
		lh.put(104, "India");
		//lh.put(105, 'A');
		lh.put(101, null);
		lh.put(101,"Rudra");
		lh.put(null, null);
		
		System.out.println(lh);
		
		System.out.println(lh.size());
		
		System.out.println(lh.isEmpty());
		
		LinkedHashMap<Integer,String>lh2=new LinkedHashMap<Integer,String>();
		lh2.put(102, "Parag");
		lh2.put(101, null);
		lh2.put(101, "Sunny");
		lh2.put(104, "Vishal");
		lh2.put(101,"Rishi");
		System.out.println(lh2);
		
		lh2.remove(2);
		System.out.println(lh2);
		
		System.out.println(lh2.containsKey(104));
		
		//Iterator is not working for linkedHashmap
		/* 
		Iterator<Integer>itr=lh1.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		System.out.println();
		*/
		
		
		for(Map.Entry<Integer, String> obj: lh.entrySet()) {
			System.out.println("Key: "+obj.getKey()+", Value: "+obj.getValue());
		}
		
		
		
	}

}
