package Exceptionhandling;

public class Example5 {

	public static void main(String[] args) {
		try {
			System.out.print(50/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			try {
				String s=null;
				System.out.println(s.length());
			}catch(Throwable t) {
				System.out.println(t);
			}
		}
		System.out.println("Program completed");

	}

}
