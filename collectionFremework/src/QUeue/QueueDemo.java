package QUeue;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class QueueDemo {
	/*
	 * It follows the FIFIO
	 * elements are accessed or removed throw head only
	 * elements can added in tail only 
	 */
	public static void main(String[] args) {
		
		Queue <Integer> q= new LinkedList<Integer>();
		q.add(10);
		q.add(50);
		q.add(100);
		q.add(5);
		q.add(100);
		q.add(10);
		q.add(null);
		
		System.out.println(q);
		System.out.print(q.remove());
		System.out.println();
		System.out.print(q.remove());
		System.out.println();
		System.out.print(q.add(550));
		System.out.print(q);
		
		System.out.println();
		System.out.print("peek: "+q.peek());
		System.out.println(q);
		System.out.println();
		System.out.print("poll: "+q.poll());
		System.out.println(q);
		
		System.out.print("----------------------------------------------");
		System.out.println();
		
		PriorityQueue pq=new PriorityQueue();
		pq.offer(50);
		pq.offer(60);
		pq.offer(50);
		pq.offer(25);
		pq.offer(15);
		pq.offer(5);
		
		
		System.out.println(pq);
		Iterator ite =pq.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		
	}

}
