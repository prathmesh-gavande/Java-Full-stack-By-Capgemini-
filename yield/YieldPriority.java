package com.yield;

public class YieldPriority implements Runnable {

	
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			Thread.yield();							//use is :- convert the running state thread into runnable state
			
			System.out.println(Thread.currentThread());
		}

		
		public static void main(String[] args) {
			Thread1 t1=new Thread1();
			Thread T=new Thread(t1,"First Thread");
			
			Thread1 t2=new Thread1();
			Thread T2=new Thread(t2,"Second Thread");
			
			T.setPriority(3);
			T2.setPriority(2);
			
			T.start();
			T2.start();

		}

	
}

