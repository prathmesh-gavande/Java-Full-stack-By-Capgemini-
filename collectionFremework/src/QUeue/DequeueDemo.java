package QUeue;
import java.lang.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {
	
	/*
	 * FIFO ,FILO
	 * null insertion NA
	 * elements can retrive,add,access from both ends
	 */
	public static void main(String[] args) {
	//	Deque dq =new Deque();
		Deque dq = new ArrayDeque();
		dq.add(50);
		dq.add("abc");
		
		dq.add('A');
		dq.add("aba");
		dq.add(50);
		System.out.println(dq);
		
		System.out.print("======================================");
		
		ArrayDeque<Integer> ai=new ArrayDeque<Integer>();
		ai.add(20);
		ai.add(50);
		ai.add(60);
		ai.add(10);
		ai.add(123);
		
		System.out.println(ai.peek());
		System.out.println(ai.pop());
		System.out.println(ai);
		
		Iterator itr= ai.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+" ");
			
		}
		
		ArrayDeque<Object> ao =new ArrayDeque<Object>();
		ao.add(dq);
		ao.add(ai);
		
	}

}
