package com.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	/*
	  1)It follow FIFO Policy 
	  2)elements are accessed or removed through head only
	  3)elements are added in tail only
	  4)null insertion not allowed
	  
	 */
	public static void main(String[] args) {
		
		Queue<Integer>q=new LinkedList<Integer>();
		q.add(10);
		q.add(50);
		q.add(100);
		q.add(5);
		q.add(100);
		q.add(10);
		q.add(null);
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(q.add(550));
		System.out.println(q);
		
		System.out.println("Peek: "+q.peek());// Peek show first element not remove the first element 
		System.out.println(q);
		System.out.println("Pool: "+q.poll());//Peek show first element and also remove the first element 
		System.out.println(q);
		
		
		
		PriorityQueue pq=new PriorityQueue();
		pq.offer(50);
		//pq.offer("abc");
		pq.offer(50);
		//pq.offer(null);
		//pq.offer('A');
		pq.offer(40);
		pq.offer(78);
		pq.add(82);
		pq.offer(45);
		System.out.println(pq);// priority que print first element as the sortest of all within the data
		
		
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		
		Queue<Integer>q1=new LinkedList<Integer>();
		q1.add(10);
		q1.add(50);
		q1.add(100);
		q1.add(5);
		q1.add(100);
		q1.add(10);
		q1.add(null);
		System.out.println(q1);
		
		Queue<String>q2=new LinkedList<String>();
		q2.add("Parag");
		q2.add("Gavande");
		q2.add("Prathmesh");
		q2.add("India");
		System.out.println(q2);
		
		Queue q3=new LinkedList();
		q3.add(q1);
		q3.add(q2);
		System.out.println(q3);
		
		
		
		

	}

}
