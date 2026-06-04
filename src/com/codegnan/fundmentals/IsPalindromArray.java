package com.codegnan.fundmentals;

import java.util.Scanner;

public class IsPalindromArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] strings= {"madam","racecar","level","java"};
		for(String str:strings) {
			System.out.println(str+" is "+(isPalin(str)?"palindrome":"not a palindrome"));
		}
		s.close();
	}
	public static boolean isPalin(String str) {
		int left=0,right=str.length()-1;
		while(left<right) {
			if(str.charAt(left++)!=str.charAt(right--)) {
				return false;
			}
		}
		return true;
	}
}
