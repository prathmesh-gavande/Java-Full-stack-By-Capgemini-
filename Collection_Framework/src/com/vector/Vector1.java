package com.vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(78);
		al.add(30);
		al.add(40);
		System.out.println(al);

		LinkedList<String>l1=new LinkedList<>();
		l1.add("Parag");
		l1.add("Gavande");
		l1.add("p");
		l1.add("asdf");
		System.out.println(l1);

		Vector<Object> v=new Vector<>();
		v.add(al);
		v.add(l1);
		System.out.println(v);

		v.addFirst(9);
		System.out.println(v);

		v.addLast("Parag");
		System.out.println(v);


		System.out.println(v.elementAt(1));

		System.out.println(v.isEmpty());



	}

}
