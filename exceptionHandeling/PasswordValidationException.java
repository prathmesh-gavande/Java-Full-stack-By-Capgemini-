package com.exceptionHandeling;

public class PasswordValidationException extends RuntimeException{

	PasswordValidationException(String password){
		super(password);
	}

}
