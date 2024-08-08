package Exceptionhandling.CustomException;

public class CustomException {

	public static void votingAgeValidation(int  age) {
		if (age<18) {
			throw new NullPointerException("you not able to voting  ");
		}
		else {
			System.out.println("You are able to voting ");
		}
	}
	public static void main(String[] args) {
		
		votingAgeValidation(17);

	}

}
