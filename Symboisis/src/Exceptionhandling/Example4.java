package Exceptionhandling;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(10/0);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Throwable e) {                     // parent class object always catch in last  
			e.printStackTrace();                  // Always follow the hierarchy 
		}
		System.out.println("Program completed");
	}

}
