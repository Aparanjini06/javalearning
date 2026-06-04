package com.codegnan.fundmentals;

import java.util.Scanner;

public class EnergyLevels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int s = sc.nextInt();// ID
			int n = sc.nextInt();// non -defective items
			int k = sc.nextInt();// defective condition divisor
			int m = sc.nextInt();// limit
			int totalSum = 0;
			int proceedCount = 0;
			for (int i = s; proceedCount < n; i++) {
				if (i % k == 0) {
					continue;
				}
				totalSum += i;
				proceedCount++;
				if (totalSum >= m) {
					break;
				}
			}
			System.out.println(totalSum);
		}
		sc.close();
	}

}
