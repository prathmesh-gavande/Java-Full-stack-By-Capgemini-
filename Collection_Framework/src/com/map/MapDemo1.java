package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Character, String>hm=new HashMap<Character,String>();
		hm.put('S', "Sunday");
		hm.put('M', "Monday");
		hm.put('T', "Tuesday");
		hm.put('W', "Wednesday");
		hm.put('T', "Thrusday");
		hm.put('F', "Friday");
		hm.put('S', "Saturday");
		
		System.out.println(hm);
		
		
		System.out.println("********************************");
		
		Map<Integer, String>hm1=new HashMap<Integer,String>();
		hm1.put(1, "Sunday");
		hm1.put(2, "Monday");
		hm1.put(3, "Tuesday");
		hm1.put(4, "Wednesday");
		hm1.put(5, "Thrusday");
		hm1.put(6, "Friday");
		hm1.put(7, "Saturday");
		
		for(Map.Entry<Integer, String> obj: hm1.entrySet()) {
			System.out.println("No: "+obj.getKey()+" Day "+obj.getValue());
		}
		

	}

}
