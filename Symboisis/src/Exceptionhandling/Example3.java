package Exceptionhandling;

public class Example3 {

	public static void main(String[] args) {
		
//		int a=0,b=10,c=50;
		int a=1,b=10,c=50;
//		System.out.println(b/a);
//		
//		System.out.println("Program completed");
		
		try {
			System.out.println(b/a);
			try {
				String s=null;
				System.out.println(s.length());
			}catch (Exception e){
//				System.out.println(e);
				e.printStackTrace();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Program completed");
	}

}
