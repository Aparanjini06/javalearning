package com.codegnan.exceptions;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception{
	public InvalidAmountException(String msg)
	{
		super(msg);
	}
}
