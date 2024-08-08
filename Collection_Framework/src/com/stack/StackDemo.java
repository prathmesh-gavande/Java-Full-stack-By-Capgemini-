package com.stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Vector v=new Stack();
		v.add(29);
		v.add("Parag");
		v.add(null);
		v.add("Parag");
		v.add(false);
		v.add('A');
		v.add(14.67);

		System.out.println(v);
		v.remove(3);
		System.out.println(v);


		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);

		s.pop();
		System.out.println(s);

		s.add(60);
		System.out.println(s);

		s.remove(0);
		System.out.println(s);

	}

}
