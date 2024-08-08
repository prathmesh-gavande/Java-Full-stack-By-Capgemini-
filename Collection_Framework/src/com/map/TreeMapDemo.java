package com.map;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
		/*
		 1)It contains only unique elements 
		 2) it is non synchronize i.e non thread safe
		 3)it have only one null key but multiple null vale
		 4)it implements binary serch tree data structure
		 */

		public static void main(String[] args) {
			TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
			tm.put(1,"Parag");
			tm.put(2,"Pratham");
			tm.put(3,"Shyam");
			tm.put(4,null);
			
			System.out.println(tm);
			System.out.println(tm.size());
			
			System.out.println("Celling: "+tm.ceilingKey(3));
			System.out.println("Celling: "+tm.ceilingKey(4));
			System.out.println("Celling: "+tm.ceilingKey(2));
			
			System.out.println("Higher Entry : "+tm.higherEntry(3));
			System.out.println("Lower Entry: "+tm.lowerEntry(3));
			System.out.println("Poll First Entry: "+tm.pollFirstEntry());
			
			System.out.println(tm.descendingKeySet());
			System.out.println(tm.tailMap(3));
			System.out.println(tm.subMap(2, 4));
			
//			Set syncTreeMap = Collections.synchronizedSortedMap(tm);
//			System.out.println(syncTreeMap);
			
		}



}
