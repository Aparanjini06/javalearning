package com.codegnan.exceptions;

@SuppressWarnings("serial")
public class InvalidPinException extends Exception {
	public InvalidPinException(String msg)
	{
		super(msg);
	}
}
