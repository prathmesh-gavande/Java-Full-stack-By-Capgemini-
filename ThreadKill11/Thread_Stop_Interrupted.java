package com.ThreadKill11;

public class Thread_Stop_Interrupted implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread Is Running");
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
			if(i==7) {
				if(!Thread.currentThread().isInterrupted()) {
					System.out.println("Inturrepted ? :  "+!Thread.currentThread().isInterrupted());
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread_Stop_Interrupted ts=new Thread_Stop_Interrupted();
		Thread t=new Thread(ts);
		t.start();

	}

}
