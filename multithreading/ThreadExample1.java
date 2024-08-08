package com.multithreading;

public class ThreadExample1 extends Thread{
	static Thread t;
	public void run() {
		System.out.println("Thread Is Running");   // Killing The Thread 
		t.stop();
		System.out.println("Thread Dead Now");
	}
	
	public static void main(String[] args) {
		ThreadExample1 te=new ThreadExample1();
		t=new Thread(te);
		t.start();

	}

}
