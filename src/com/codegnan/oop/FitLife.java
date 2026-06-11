package com.codegnan.oop;

public class FitLife {
	int id;
	String type;

	public FitLife(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public FitLife(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int calculateFine(int hours) {
		int calories = hours * 100;
		if (calories >= 1000) {
			calories = 1000;
		}
		return calories;
		//return Math.min(calories,1000);
	}

	public int calaculateFine(int hours, String type) {
		int calories = 0;
		if (type.equalsIgnoreCase("cardio")) {
			calories = hours * 120;
		} else {
			if (type.equalsIgnoreCase("strength")) {
				calories = hours * 80;
			}
		}
		if (calories >= 1000) {
			calories = 1000;
		}
		return calories;
	}

	public int calculateFine(int hours, int fixedCalories) {
		int calories = hours * 100 + fixedCalories;
		if (calories >= 1000) {
			calories = 1000;
		}
		return calories;
	}
}
