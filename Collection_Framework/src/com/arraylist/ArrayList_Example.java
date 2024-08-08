package com.arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ArrayList_Example {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>(100);

		al.add(20);
		al.add(null);
		//al.add(30.4); 		// give error because of it define Integer Type
		//al.add("Parag");	// give error
		//al.add(true);		// give error
		System.out.println(al);

		List<String>al3=new ArrayList<>();
		al3.add("Parag");
		al3.add("A");
		al3.add("123");
		al3.add(null);
		al3.add("Parag");
		System.out.println(al3);

		Collection<Object> c=new ArrayList<>();
		c.add(al);
		c.add(al3);
		c.add(null);
		System.out.println(c);

		Collection<Object> list=Collections.synchronizedCollection(c);
		System.out.println("Synchronized list: "+list);

		//Constrctors of ArrayList
		ArrayList a=new ArrayList();
		ArrayList a1=new ArrayList(50);
		ArrayList a2=new ArrayList(a);



	}

}
