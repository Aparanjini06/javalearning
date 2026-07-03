package com.codegnan.exceptions;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String msg)
	{
		super(msg);
	}
}
