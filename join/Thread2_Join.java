package com.join;

public class Thread2_Join implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 Is Running");
		
		for(int i=0; i<3;i++) {
			System.out.println("I:- "+i);
		}
		System.out.println("Thread 2 Is Ended");
	}

}
