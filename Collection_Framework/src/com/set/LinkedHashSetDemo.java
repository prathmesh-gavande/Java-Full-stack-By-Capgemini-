package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Spliterator;

public class LinkedHashSetDemo {
	
	
	/*
	 LinkedHashSet:-
	1)null insertion is allowed 
	2)duplicate is not allowed 
	3)slower than hashSet
	4)it is Non Sysnchronize
	5)efficient for insertion and deletion operation
	6)linkedHashSet=LinkedList+HashSet

	 
	*/

	public static void main(String[] args) {
		
		Set<Integer>lset=new LinkedHashSet<Integer>();
		lset.add(100);
		lset.add(40);
		lset.add(50);
		lset.add(78);
		lset.add(92);
		lset.add(27);
		lset.add(39);
		lset.add(20);
		System.out.println(lset);
		System.out.println(lset.size());
	
		
		
		LinkedHashSet<String>lset1=new LinkedHashSet<String>();
		lset1.add("Maharashtra");
		lset1.add(null);
		lset1.add("abc");
		lset1.add("Shirpur");
		lset1.add("Maharashtra");
		lset1.add(null);
		
		System.out.println(lset1);
		
		System.out.println("********************************");
		lset.spliterator();
		Spliterator<Integer>sitr=lset.spliterator();
		sitr.forEachRemaining(ans -> System.out.println(ans));
		System.out.println("*********************************");
		
		
		
		HashSet hs=new HashSet();
		hs.add(null);
		hs.add('A');
		
	
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add(30);
		al.add(40);
		
		LinkedList<Integer>l4=new LinkedList<>();
		l4.add(10);
		l4.add(20);
		l4.add(null);
		l4.add(30);
		l4.add(40);
		System.out.println(l4);
		
		
		LinkedHashSet<Object>lset2=new LinkedHashSet<Object>();
		lset2.add(lset1);
		lset2.add(lset);
		lset2.add(hs);
		lset2.add(l4);
		lset2.add(al);
		
		System.out.println(lset2);
		
		
		
		
		
		
		
	}

}
