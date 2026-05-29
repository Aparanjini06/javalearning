package com.codegnan.fundmentals;

import java.util.Scanner;

public class PartnerShip {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int investA= s.nextInt();
		int monthsA=s.nextInt();
		int investB=s.nextInt();
		int joinedAfterA=s.nextInt();
		int profit =s.nextInt();
		int effectiveA=investA*monthsA;
		int effectiveB=investB*(12-joinedAfterA);
		int totalRatio= effectiveA+effectiveB;
		double bShare = ((double)effectiveB /totalRatio) *profit;
		System.out.println(bShare);
		s.close();
	}

}
