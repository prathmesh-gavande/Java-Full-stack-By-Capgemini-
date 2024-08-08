package com.multiThreaded;

public class ThreadPriority implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		
		ThreadPriority tp = new ThreadPriority();
		
		
		Thread aa=new Thread(tp,"First Thread");
		Thread bb=new Thread(tp,"Second Thread");
		Thread cc=new Thread(tp,"Third Thread");
		
//		System.out.println(aa.getPriority());    //Default Priority
//		System.out.println(bb.getPriority());
//		System.out.println(cc.getPriority());
		
		aa.setPriority(5); 					//Set priorities 
		bb.setPriority(4);
		cc.setPriority(2);
		
		aa.start();
		bb.start();
		cc.start();

	}

}
