package Multithreading;

public class OneThread_MultipleTask implements Runnable{
	
	int a=20,b=10;
	@Override
	public void run() {
		
		addition();
		Substracyion();
		multiplication();
		division();
		modulus();
		
	}
	void addition() {
		System.out.println("add :"+(a+b));
	}
	
	void Substracyion() {
		System.out.println("sub :"+(a-b));
	}
	
	void multiplication() {
		System.out.println("mul :"+(a*b));
	}
	
	void division() {
		System.out.println("div :"+(a/b));
	}
	
	void modulus() {
		System.out.println("mod :"+(a%b));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main thread is running ");
		OneThread_MultipleTask ot=new OneThread_MultipleTask();
		Thread t=new Thread(ot);
		t.start();
	}

}
