package Exceptionhandling.CustomException;

public class PasswordValidation extends RuntimeException{
	
	public PasswordValidation(String msg) {
		super(msg);
	}
}
