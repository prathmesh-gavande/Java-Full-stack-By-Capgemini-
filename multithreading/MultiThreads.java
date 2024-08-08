package com.multithreading;

public class MultiThreads extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MultiThreads mt=new MultiThreads();
		Thread.currentThread().setName("Parag");
		System.out.println(10/0);
		//mt.setName("Parag");
		mt.run();
		MultiThreads mt1=new MultiThreads();
		mt.setName("Prathmesh");
		mt.run();
		MultiThreads mt2=new MultiThreads();
		mt.setName("Yash");
		mt.run();
		

	}

}
