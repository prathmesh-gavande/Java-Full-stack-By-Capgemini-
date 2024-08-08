package com.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo {

	/*
	 Linked List:-
	1)Duplicate data is allowed
	2)Nill insertion is allowed
	3)homogeneous as well as heterogeneous data allow to store
	4)linked list is a non synchronized (non thread safe)
	 */

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		l1.add(40);
		l1.add("Parag");
		l1.add('a');
		l1.add(20.4);
		l1.add(false);
		l1.add(40);
		l1.add(null);
		l1.add(1234456678);

		System.out.println(l1);

		l1.remove();
		System.out.println(l1);

		l1.addFirst("PCPIT");
		System.out.println(l1);

		l1.addLast("Shirpur");
		System.out.println(l1);

		l1.removeFirst();
		System.out.println(l1);

		l1.removeLast();
		System.out.println(l1);

		l1.removeLast();
		System.out.println(l1);

//		l1.clear();
//		System.out.println(l1);

		System.out.println(l1.clone());

		System.out.println(l1.contains("Parag"));

		System.out.println(l1.reversed());

		LinkedList l2=new LinkedList();

		l2.add(60);
		l2.add("Parag Gavande");
		l2.add('P');
		l2.add(4.4);
		l2.add(true);
		l2.add(60);
		l2.add(null);
		l2.add(342361789);
		System.out.println(l2);

		l2.add(l1);
		System.out.println(l2);



		LinkedList<Integer>l4=new LinkedList<>();
		l4.add(10);
		l4.add(20);
		l4.add(null);
		l4.add(30);
		l4.add(40);
		System.out.println(l4);

		LinkedList<String>l5=new LinkedList<>();
		l5.add("Parag");
		l5.add("Gavande");
		l5.add("p");
		l5.add(null);
		System.out.println(l5);

		Collection<Object> c=new ArrayList<>();
		c.add(l4);
		c.add(l5);
		//c.add(null);
		System.out.println(c);

		Collection<Object> LinkedList=Collections.synchronizedCollection(c);
		System.out.println("Synchronized list: "+LinkedList);

		LinkedList<Integer>l8=new LinkedList<>();
		l8.addAll(l4);
		System.out.println(l8);


		Iterator<Integer>itr=l4.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		System.out.println();

//		System.out.println("**************************");
//		for(int a:l4) {
//			System.out.println(" "+l4);
//		}

		System.out.println("**************************");
		for(Object a:c) {
			System.out.println(" "+c);
		}
		System.out.println("**************************");

		Iterator<Integer>itr1=l4.iterator();
		while(itr.hasNext()) {
			System.out.print("Peek "+l4.peek());
			System.out.print(l4);
			System.out.print("Poll "+l4.poll());
			System.out.print(l4);
		}
		System.out.println();


		System.out.println("=======================================");

		ListIterator litr=l1.listIterator();
		System.out.println("Forward Direction Iteration");
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();



		System.out.println("=======================================");
		System.out.println("Backward Direction Iteration");
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+" ");
		}
		System.out.println();

		System.out.println("+++++++++++++++++++++++++");
		System.out.println(litr.previousIndex());
		System.out.println(litr.nextIndex());


	}

}
