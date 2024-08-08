package com.synchronization3;

public class MainDivision throws InterruptedException{

	Table t=new Table();
	
	Thread1 t1=new Thread1(t);
	
	Thread2 t2=new Thread2(t);
	
	t1.start();
	t2.start();
}

}
