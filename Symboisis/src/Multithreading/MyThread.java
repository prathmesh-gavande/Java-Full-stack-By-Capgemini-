package Multithreading;

public class MyThread  implements Runnable{
	
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String[] args) {
		MyThread mt =new MyThread();
		Thread t=new Thread(mt);
		t.start();
	}

}
