package com.codegnan.exceptions;

import java.util.Scanner;

public class MarriageEligibilityChecker {
	
	public void checkEligibilty(int age) throws TooYoungException, TooOldException
	{
		if(age<18)
		{
			throw new TooYoungException("Marriage caanot be approved. age is below 18 years");
		}
		else
		{
			if(age>60)
			{
				throw new TooOldException("Marriage cannot be approved age is above 60 years");
			}
			else
			{
				System.out.println("marriage approved details will be processed soon");
			}
		}
	}
	public static void main(String[] args) {
		MarriageEligibilityChecker checker=new MarriageEligibilityChecker();
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			checker.checkEligibilty(age);
		}
		catch(TooYoungException | TooOldException e)
		{
			e.printStackTrace();
		}
		sc.close();
		
	}
}
