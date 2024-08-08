package com.join;

public class Thread1_Join implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 Is Running");
		
		for(int i=0; i<3;i++) {
			System.out.println("I:- "+i);
		}
		System.out.println("Thread 1 Is Ended");
	}
	
	

}
