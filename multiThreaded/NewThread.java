package com.multiThreaded;

public class NewThread implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5; i++) {
			System.out.println("First Thread Is Running "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.getMessage();
			}
			
		}
		System.out.println("First Thread Stopped.");
	}

}
