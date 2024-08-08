package com.join;

public class Main_Joining {

	public static void main(String[] args) throws InterruptedException{
		Thread1_Join tj1=new Thread1_Join();
		Thread t=new Thread(tj1);
		
		Thread2_Join tj2=new Thread2_Join();
		Thread t2=new Thread(tj2);
		
		t.start();
		t.join();
		t2.start();
		t2.join();

	}

}
