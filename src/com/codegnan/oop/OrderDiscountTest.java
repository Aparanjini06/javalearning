package com.codegnan.oop;

import java.util.Scanner;

public class OrderDiscountTest {

	public static void main(String[] args) {
		OrderDiscount o=new OrderDiscount();
		Scanner s=new Scanner(System.in);
		int order=s.nextInt();
		int orderAmount=s.nextInt();
		int staticDiscount=(int) OrderDiscount.totalOrders(order);
		int discount=(int) o.orderAmount(orderAmount);
		System.out.println(staticDiscount+" "+discount);
		s.close();
	}

}
