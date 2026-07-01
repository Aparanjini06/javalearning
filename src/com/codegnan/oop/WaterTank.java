package com.codegnan.oop;

import java.util.Scanner;

public class WaterTank {
	private int currentLevel = 0;
	private int maxLevel = 0;

	public void setCurrentLevel(int currentLevel) {
		if (currentLevel >= 0 && currentLevel <= 500) {
			this.currentLevel = currentLevel;

			if (currentLevel > maxLevel) {
				maxLevel = currentLevel;
			}
		}
	}

	public int getCurrentLevel() {
		return currentLevel;

	}

	public int getMaxlevel() {
		return maxLevel;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		WaterTank wt = new WaterTank();
		int level;
		while (true) {
			level = s.nextInt();
			if (level == -999) {
				break;
			}
			wt.setCurrentLevel(level);

		}
		System.out.println(wt.getCurrentLevel());
		System.out.println(wt.getMaxlevel());
		s.close();
	}
}
