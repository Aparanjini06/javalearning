package com.codegnan.oopprogramming;



public class My_Calculator extends Calculator{

	public My_Calculator(int firstNum, int secondNum) {
		super(firstNum, secondNum);
		// TODO Auto-generated constructor stub
	}
	
	public int multiplication() {
		return firstNum*secondNum;
	}
	/*public My_Calculator() {
		super(0, 0);
		
	}
	public void InputValue() {
		Scanner s=new Scanner(System.in);
		firstNum=s.nextInt();
		secondNum=s.nextInt();
		s.close();
		
	}
	public void addition() {
		int add=firstNum+secondNum;
		System.out.println(add);
	}
	public void multiplication() {
		int mul=firstNum*secondNum;
		System.out.println(mul);
	}*/
	
}
