package Exceptionhandling.CustomException;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter the password: ");
		String password=sc.nextLine();
		
		try {
			if(password.equals("1234") && username.equals("prathmesh")) {
				System.out.println(" Valid user ");
				
//				System.out.print("this is inrichable statement");  //syntax error 
				
			}else {

				throw new PasswordValidation("Wrong username and  Password  ..!");
			}
		}catch (PasswordValidation e){
			e.printStackTrace();
			
		}
		
		System.out.println("Exception handled ..  ");
	}

}
