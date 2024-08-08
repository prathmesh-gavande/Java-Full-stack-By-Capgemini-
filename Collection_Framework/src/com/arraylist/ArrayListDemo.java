package com.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(20);
		al.add("Parag");
		al.add('a');
		al.add(30.4);
		al.add(true);
		al.add(null);
		al.add(null);

		System.out.println(al);


		List al2=new ArrayList();
		al2.add(null);
		al2.add(40);
		al2.add("Parag");
		al2.add('a');
		al2.add(20.30);
		al2.add(40);
		al2.add(false);

		System.out.println(al2);


		ArrayList al3=new ArrayList();
		al3.add(al);
		al3.add(al2);
		System.out.println(al3);



	}

}
