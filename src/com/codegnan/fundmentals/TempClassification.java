/*16.Temperature Classification
Question:
A weather monitoring system categorizes the day's temperature to help people plan their activities.
• Hot if the temperature is above 30°C
• Moderate if the temperature is between 15°C and 30°C
• Cold if the temperature is below 15°C
Write a Java program that accepts the temperature and classifies the weather condition using nested ternary operators.
Test Case 1
Input:
 35
Output:
 The weather is: Hot
Test Case 2
Input:
 25
Output:
 The weather is: Moderate
Test Case 3
Input:
 15
Output:
 The weather is: Moderate
Test Case 4
Input:
 10
Output:
 The weather is: Cold*/
package com.codegnan.fundmentals;

import java.util.Scanner;

public class TempClassification {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String res=(num>30)?"The weather is: Hot":(num>15 && num<=30)?"The weather is: Moderate":"The weather is: Cold";
		System.out.println(res);
		s.close();
	}

}
