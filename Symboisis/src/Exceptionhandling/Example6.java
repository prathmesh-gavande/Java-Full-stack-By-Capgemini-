package Exceptionhandling;

public class Example6 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int [3];
			System.out.println(a[5]);
		}finally {								//always place after try ,it is always executes
			System.out.println("finally block");
		}

	}

}
