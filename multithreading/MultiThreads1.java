package com.multithreading;

public class MultiThreads1 extends Thread{
	String task;
	MultiThreads1(String task){
		this.task=task;
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(task+" "+i);
			
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.getMessage();
			}
			
		}
	}

	public static void main(String[] args) {
		MultiThreads1 mt=new MultiThreads1("Have you Pass Third Year Exam ?");
		MultiThreads1 mt1=new MultiThreads1("Get Admission in Last Year.");
		MultiThreads1 mt2=new MultiThreads1("Start Study .");
		Thread t=new Thread(mt);
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t.start();
		t1.start();
		t2.start();
		
		int count=Thread.activeCount();
		System.out.println("Number Of Active Threads: "+count);
	//	mt.run();

	}

}
