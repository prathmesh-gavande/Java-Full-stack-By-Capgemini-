package com.threadKill;

public class Main {

	public static void main(String[] args) {
		
		First_Thread ft=new First_Thread();
		Second_Thread st=new Second_Thread();
		
		Thread t=new Thread(ft);
		Thread t2=new Thread(st);
		
		
		t.start();
		//t.stop();
		t2.start();

	}

}
