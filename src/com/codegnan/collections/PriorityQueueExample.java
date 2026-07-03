package com.codegnan.collections;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class PriorityQueueExample {
	public static void main(String[] args) {
		/*Queue<String>pq=new PriorityQueue<>(new PriorityMyComparator());
		pq.add("Malli");
		pq.add("Arjun");
		pq.add("arun");
		pq.add("mani");
		pq.add("Sunil");
		
		Deque<Integer>dq=new ArrayDeque<>(2);
		dq.offerFirst(10);
		dq.addFirst(20);
		System.out.println(dq);
		System.out.println(dq.offerFirst(40));
		dq.addFirst(30);
		System.out.println(dq);*/
		Deque<String> d =new LinkedBlockingDeque<>(2);
		d.offerFirst("java");
		d.offerFirst("python");
		System.out.println(d);
		d.offerFirst("c");
	}
}
