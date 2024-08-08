package com.synchronization;

public class InsufficientFundsException extends RuntimeException{
	InsufficientFundsException(String msg){
		super(msg);
	}
}
