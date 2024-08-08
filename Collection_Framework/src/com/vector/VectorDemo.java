package com.vector;

import java.util.Vector;

public class VectorDemo {

	/*
	 Vector:
	1) Preserve Insertion Order
	2) Duplicates Allowed
	3)Null insertion allowed
	4)Homogeneous as well as heterogeneous data allow to store
	5)vector class implements serilizable, clonable, and random access interface
	6)serilizable:-
	7)Most of the methods are synchronized
	 */

	public static void main(String[] args) {

		Vector v=new Vector();
		v.add(48);
		v.add("Parag");
		v.add('p');
		v.add(null);
		v.add("Parag");
		v.add(true);
		System.out.println(v);
		System.out.println("Capacity of v: "+v.capacity());

		System.out.println("*********************************");

		Vector<Integer>v1=new Vector();
		System.out.println(v.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(70);
		v1.add(80);
		v1.add(90);
		v1.add(100);
		System.out.println(v1);
		System.out.println("Old Capacity: "+v1.capacity());
		v1.add(200);
		System.out.println("New Capacity: "+v1.capacity());


		Vector<String>v2=new Vector<>(20);
		System.out.println(v2.capacity());

		System.out.println("****************************");

		Vector<Integer>v5=new Vector<>(15,3);
		v5.add(10);
		v5.add(20);
		v5.add(30);
		v5.add(40);
		v5.add(50);
		v5.add(60);
		v5.add(70);
		v5.add(80);
		v5.add(90);
		v5.add(100);
		System.out.println("Before: "+v5.capacity());
		v5.add(160);
		v5.add(170);
		v5.add(180);
		v5.add(190);
		v5.add(200);
		System.out.println(v5.capacity());
		v5.add(300);
		System.out.println("After: "+v5.capacity());


		v5.setElementAt(345,4);
		System.out.println(v5);

		System.out.println(v5.reversed());
		System.out.println(v5.elementAt(0));

		System.out.println(v5.contains(150));

	}

}
