package com.synchronization2;

public class Thread2 extends Thread{

Table t;
	
	@Override
	public void run() {
		t.printTable(10.5);
	}
	
	public Thread2(Table t) {
		this.t=t;
	}

}
