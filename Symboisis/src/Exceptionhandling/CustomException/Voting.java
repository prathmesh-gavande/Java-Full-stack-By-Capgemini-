package Exceptionhandling.CustomException;
import java.util.Scanner;
public class Voting {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ente the age: ");
		
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new AgeValidationException("Not eligible ..!");
				
//				System.out.print("this is inrichable statement");  //syntax error 
				
			}else {
				System.out.println("You eligible for voting. ");
				System.out.print("this is richable statement");
			}
		}catch (AgeValidationException e){
			e.printStackTrace();
			
		}
		
		System.out.println("Exception handled ..  ");
	}

}
