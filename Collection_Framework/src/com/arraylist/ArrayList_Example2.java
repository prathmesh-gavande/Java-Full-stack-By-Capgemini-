package com.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example2 {

	public static void main(String[] args) {

		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add(30);
		al.add(40);

		ArrayList<Integer>al2=new ArrayList<>();
		al2.addAll(al);
		System.out.println(al2);

		Iterator<Integer>itr=al2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//Print Using For each loop

	}

}
