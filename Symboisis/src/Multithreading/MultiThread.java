package Multithreading;

public class MultiThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MultiThread mt=new MultiThread();
		Thread.currentThread().setName("Prathmesh");
		System.out.println(10/0);
		mt.run();
		MultiThread mt1=new MultiThread();
		mt.setName("mt1");
		mt1.run();
		MultiThread mt2=new MultiThread();
		mt.setName("mt2");
		mt2.run();
	}

}
