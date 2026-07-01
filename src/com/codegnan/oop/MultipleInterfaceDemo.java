package com.codegnan.oop;

public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		Human h=new Human("appu");
		Robot r=new Robot("R2D2");
		System.out.println("Human Daily Routine");
		h.showStatus();
		h.work();
		h.work();
		h.takeBreak();
		h.eat();
		h.digest();
		h.work();
		h.sleep();
		h.wakeUp();
		h.showStatus();
		System.out.println("Robot operations");
		r.work();
		r.work();
		r.work();
		r.work();
		r.work();
		r.work();
		r.takeBreak();
		r.charge();
		r.work();
	}
}
