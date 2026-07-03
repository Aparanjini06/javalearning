package com.codegnan.oopprogramming;

public class ContractEmployee extends Employee1{
	double contractAmount;
	public ContractEmployee(String name,double contractAmount) {
		super(name);
		this.contractAmount=contractAmount;
	}
	@Override
	public double calculateSalary()
	{
		return contractAmount;
	}
}
