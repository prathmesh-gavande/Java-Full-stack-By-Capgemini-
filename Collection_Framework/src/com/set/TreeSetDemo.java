package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	/*
	 1)Duplicate are not allowed
	 2)access and retrival is fast
	 3)null insertion is not allowed 
	 4)treeset automitically sorted data in ascending order
	 5)internally it implements treemap
	 6)Treeset is non synchronized it is non thread safe
	 7)Only Homogeneous data insertion is allowed 
	 8)Treeset Is faster than array list and linkedlist when seartion and retrival operation 
	9)Treeset is Slower than array list and linkedlist when insertion and deletion operation 


	 */
	

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		//ts.add(null);
		ts.add("Parag");
		//ts.add(10);
		//ts.add(null);
		//ts.add(10);
		//ts.add(30.4);
		//ts.add('A');
		ts.add("Gavande");
		ts.add("India");
		ts.add("America");
		ts.add("Germany");
		ts.add("Brazil");
		
		System.out.println(ts);
		
		SortedSet<Character>ss=new TreeSet<Character>();
		ss.add('Z');
		ss.add('B');
		ss.add('A');
		ss.add('O');
		ss.add('I');
		ss.add('H');
		ss.add('P');
		
		System.out.println(ss);
		
		System.out.println(ss.reversed());
		
		Set<Integer>s1=new TreeSet<Integer>();
		s1.add(10);
		s1.add(90);
		s1.add(40);
		s1.add(20);
		s1.add(70);
		
		System.out.println(s1);
		
		Set<Integer>s2=new TreeSet<Integer>();
		s1.add(70);
		s1.add(90);
		s1.add(30);
		s1.add(10);
		s1.add(80);
		
		System.out.println(s2);
		
		//Heterogeneous type of Treeset are not allow to add in single treeset  it gives exception
		/*
		TreeSet<Object>tsobj=new TreeSet<Object>();
		tsobj.add(ts);
		tsobj.add(ss);
		tsobj.add(s1);
		
		System.out.println(tsobj);
		*/
		
		Set<Object>tsobj1=new TreeSet<Object>();
		tsobj1.addAll(s1);
		tsobj1.addAll(s2);
		
		System.out.println(tsobj1);
		System.out.println("***********************");
		
		
		TreeSet ts2=new TreeSet();
		ts2.add(10);
		ts2.add(60);
		ts2.add(170);
		ts2.add(14);
		ts2.add(67);
		ts2.add(93);
		ts2.add(70);
		ts2.add(930);
		ts2.add(60);
		ts2.add(0);
		ts2.add(05);
		
		System.out.println(ts2);
		
		System.out.println("Celling: "+ts2.ceiling(82));
		System.out.println("Celling: "+ts2.ceiling(93));
		System.out.println("Floor: "+ts2.floor(82));
		
		System.out.println("Floor: "+ts2.floor(10));
		System.out.println("Floor: "+ts2.floor(15));
		System.out.println("Floor: "+ts2.floor(9));
		
		System.out.println("Lower "+ts2.lower(82));
		System.out.println("Higher "+ts2.higher(82));
		
		System.out.println("First: "+ts2.first());
		System.out.println("Last: "+ts2.last());
		
		System.out.println("HeadSet: "+ts2.headSet(55,true));
		System.out.println("TailSet: "+ts2.tailSet(90,true));
		
		System.out.println("Subset: "+ts2.subSet(50, 100));
		
		
		Iterator<Integer>itr=ts2.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		System.out.println();
		
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(50);
		al.add(4);
		al.add(150);
		al.add(30);
		al.add(90);
		System.out.println(al);
		
		TreeSet<Integer>ts5=new TreeSet<Integer>(al);
		System.out.println("TreeSet: "+ts5);
		
		//int arr[]= {40,20,40,72,10};
		//TreeSet<Integer>tss=new TreeSet<Integer>(arr);   // Give Error 
		//System.out.println(tss);
		
		TreeSet<Integer>tss1=new TreeSet<Integer>();
		int arr[]= {40,20,40,72,10};
		for(int i=0;i<arr.length;i++) {
			tss1.add(arr[i]);
		}
		System.out.println(tss1);
		
		 
		System.out.println("*************************");
		TreeSet<Integer> itr2=new TreeSet<Integer>();
		System.out.println("TreeSet "+ts5);
		Iterator<Integer>itr1=ts5.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr1.next()+" ");
		}
		
		System.out.println("*****************************");
		SortedSet abc = Collections.synchronizedSortedSet(ts2);
		System.out.println(abc);
		
		
	}

}
