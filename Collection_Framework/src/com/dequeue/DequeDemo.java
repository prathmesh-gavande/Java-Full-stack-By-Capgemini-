package com.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

	/*
	 1)It implements FIFO/ FILO policy
	 2)null insertion not allow
	 3)elements can retrived, add, access from both ends
	 */
	public static void main(String[] args) {
		

		Deque dq=new ArrayDeque();
		dq.add(50);
		dq.add("abc");
		//dq.add(null);
		dq.add('A');
		dq.add("abc");
		dq.add(50);
		
		System.out.println(dq);
		
		System.out.println(dq.offer(100));
		System.out.println(dq);
		
		dq.addFirst("Shirpur");
		System.out.println(dq);
		
		dq.addLast("Nandurbar");
		System.out.println(dq);
		
		dq.removeLast();
		System.out.println(dq);
		
		dq.add(432);
		dq.add('z');
		dq.add("XYZ");
		dq.add(789);
		System.out.println(dq);
		
		dq.add(432);
		dq.add('z');
		dq.add("XYZ");
		dq.add(789);
		dq.add(432);
		dq.add('z');
		dq.add("XYZ");
		dq.add(789);
		System.out.println(dq);
		
		
		dq.add("XYZ");
		dq.add(789);
		System.out.println(dq);
		
		ArrayDeque<Integer>ai=new ArrayDeque<Integer>();
		ai.add(789);
		ai.add(432);
		ai.add(789);
		ai.add(432);
		ai.add(789);
		ai.add(432);
		ai.add(789);
		ai.add(432);
		
		System.out.println(ai.peek());
		System.out.println(ai.pop());
		System.out.println(ai);
		
		Iterator itr=ai.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		
		
		ArrayDeque<Object>ao=new ArrayDeque<Object>();
		ao.add(dq);
		ao.add(ai);
		System.out.println(ao);
		
		
		
		
		
	}

}
