package com.codegnan.oop;

public class OrderDiscount {
	public static double totalOrders(int order) {
		if (order < 0) {
			return 0;
		}
		double discount = order * 0.10;
		if (discount > 100) {
			discount = 100;
		}
		return discount;
	}

	public double orderAmount(int orderAmount) {
		double dis = 0;
		if (orderAmount < 0) {
			return 0;
		}
		if (orderAmount <= 50) {
			dis = orderAmount * 0.05;
		} else {
			dis = orderAmount * 0.15;
		}
		if (dis > 100) {
			dis=100;
		}
		return dis;
	}
}
