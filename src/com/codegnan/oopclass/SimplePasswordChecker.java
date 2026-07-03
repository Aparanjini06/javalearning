package com.codegnan.oopclass;

public class SimplePasswordChecker implements PasswordChecker {

	@Override
	public String checkLenght(String password) {
		return ("length : "+password.length());
	}

	@Override
	public String checkComplexity(String password) {
		if(password.length()<8)
		{
			return "weak";
		}
		else {
			if(password.length()==8)
			{
				return "Medium";
			}
			else {
				return "Strong";
			}
		}
	}
	

}
