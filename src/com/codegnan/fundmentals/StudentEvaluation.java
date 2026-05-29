package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentEvaluation {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int s1= s.nextInt();
		int s2=s.nextInt();
		int s3=s.nextInt();
		int total= 0;
		total+=s1;
		total+=s2;
		total+=s3;
		int avg=total/3;
		
		boolean isAvgOk = avg>=50;
		boolean areScoreOk = (s1>40)&&(s2>40)&&(s3>40);
		boolean isEligible = isAvgOk && areScoreOk;
		System.out.println(total);
		System.out.println(avg);
		System.out.println(isEligible);
		s.close();
	}

}
