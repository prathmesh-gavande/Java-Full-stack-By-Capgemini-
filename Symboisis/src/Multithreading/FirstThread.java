package Multithreading;
import java.lang.*;
public class FirstThread extends Thread {
	
	@Override
	public void run() {
//		for(int i=0;i<50;i++) {
//			System.out.print(i+" ");
//		}
		System.out.println("First thread running");
	}
	public static void main(String [] args) {
		System.out.println("Main thread running");
		FirstThread ft=new FirstThread();
		ft.run();
	}

}
