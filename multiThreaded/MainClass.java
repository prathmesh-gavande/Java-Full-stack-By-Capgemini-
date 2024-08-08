package com.multiThreaded;

public class MainClass {

	public static void main(String[] args) {
		
//		int count=Thread.activeCount();
//		System.out.println("Number Of Active Threads: "+count);
		
		
		NewThread nt = new NewThread();
		Thread t=new Thread(nt);
		t.start();
		
		NewThread2 nt2 = new NewThread2();
		Thread t2=new Thread(nt2);
		t2.start();
		
		int j=0;
		while(j<5) {
			System.out.println("Main Thread Running "+j);
			j=j+1;
		}
		System.out.println("Main Thread Is Stopped ");
		
		int count=Thread.activeCount();
		System.out.println("Number Of Active Threads: "+count);

	}

}
