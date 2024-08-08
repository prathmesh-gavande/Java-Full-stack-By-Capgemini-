package Exceptionhandling;

public class CatchFinally {

	public static void main(String[] args) {
		try {
			int a[]=new int [3];
			System.out.println(a[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {							
			System.out.println("finally block");
		}


	}

}
