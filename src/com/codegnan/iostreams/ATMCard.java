package com.codegnan.iostreams;

import java.io.Serializable;

public class ATMCard implements Serializable{
	private long cardNumber;
	private transient int pin;
	private transient String expireDate;
	private transient int cvv;
	private String cardHolderName;
	public ATMCard(long cardNumber, int pin, String expireDate, int cvv, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.expireDate = expireDate;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
	}
	@Override
	public String toString() {
		return "ATMCard [cardNumber=" + cardNumber + ", pin=" + pin + ", expireDate=" + expireDate + ", cvv=" + cvv
				+ ", cardHolderName=" + cardHolderName + "]";
	}
	
	
	
}
