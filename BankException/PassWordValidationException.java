package com.BankException;

public class PassWordValidationException extends RuntimeException {

	PassWordValidationException(String password){
		super(password);
	}

}
