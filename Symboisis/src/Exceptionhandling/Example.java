package Exceptionhandling;

public class Example {

	public static void main(String[] args) {
		
		int a[]=new int [5];
		
		a[2]=15;
		a[4]=17;
		
		try {
			a[6]=100;
		}catch(Exception e){
			System.out.println(e);
		}
		
		for(int i: a) {
			System.out.print(i+" ");
		}
	}

}
