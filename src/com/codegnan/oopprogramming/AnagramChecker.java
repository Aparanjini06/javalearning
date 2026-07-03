package com.codegnan.oopprogramming;

import java.util.Scanner;

public class AnagramChecker {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1=sc.next();
		System.out.println("Enter String 2: ");
		String s2=sc.next();
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams");
			return;
		}
		//s2: assume strings are anagram
		boolean isAnagram=true;
		//s3: trace each character of first string
		for(int i=0;i<s1.length();i++)
		{
			//take one character from s1
			char ch=s1.charAt(i);
			//initialize counter for both strings
			int count1=0;
			int count2=0;
			//s4: count occurrence ch1 of s1
			for(int j=0;j<s1.length();j++)
			{
				if(ch==s1.charAt(j)) {
					count1++;
				}
			}
			for(int j=0;j<s2.length();j++)
			{
				if(ch==s2.charAt(j))
				{
					count2++;
				}
			}
			if(count1!=count2)
			{
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}

}
