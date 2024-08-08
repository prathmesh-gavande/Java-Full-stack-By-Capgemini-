package com.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	/*
	 1)
	 
	 */
	

	public static void main(String[] args) {
		
		Map<Integer, String>m= new HashMap<Integer, String>();
		m.put(101, "Parag");
		m.put(102, "Prathmesh");
		m.put(103, "Rohit");
		m.put(104, "Ganesh");
		m.put(105, "Raghav");
		m.put(106, null);
		m.put(null,"Durgesh");
		m.put(107, "Parag");
		
		System.out.println(m);
		
		m.remove(105, "Raghav");
		
	    System.out.println(m);
	    
	    m.replace(104, "Gaurav");
	    System.out.println(m);
	    
	    m.replace(102, "Prathmesh", "Chetan");
	    System.out.println(m);
	    
	    
	    Iterator itr=m.values().iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next()+" ");
	    }
	   System.out.println("*************************");
	   
	    //List Iterator is not support
	    for(String s: m.values()) {
	    	System.out.println(s);
	    }
	    
	    System.out.println("*************************");
	    Iterator itr2=m.keySet().iterator();
	    while(itr2.hasNext()) {
	    	System.out.println(itr2.next()+" ");
	    }
	    
	    
	    
	   
	}

}
