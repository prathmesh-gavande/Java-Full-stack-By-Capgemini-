package com.synchronization2;

public class Thread1 extends Thread{
	Table t;
	
	@Override
	public void run() {
		t.printTable(10);
	}
	
	public Thread1(Table t) {
		this.t=t;
	}
}
