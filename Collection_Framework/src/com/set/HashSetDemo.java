package com.set;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	/*
	 * HashSet:- 1)implements hashtable 2)INsertion order Is not preserved
	 * 3)Heterogenous data allowed 4)null insertion is allowed 5)implements
	 * serilization, clonable, random access interface
	 */

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(null);
		hs.add("abcd");
		hs.add(234);
		hs.add(34.56);
		hs.add('A');

		System.out.println(hs);
		System.out.println(hs.size());

		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		System.out.println(hs1);

		Set syncHashset = Collections.synchronizedSet(hs1);
		System.out.println(syncHashset);

		hs1.remove(30);
		System.out.println(hs1);
		
		boolean ans=hs1.equals(hs);
		System.out.println(ans);
		

		
	}

}
