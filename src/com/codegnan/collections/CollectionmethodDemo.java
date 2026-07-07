package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionmethodDemo {
	public static void main(String[] args) {
		Collection<String> fruits=new ArrayList<>();
		System.out.println("--------add()--------------");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("kiwi");
		fruits.add("carrot");
		System.out.println("fruits after add()"+fruits);
		System.out.println("----------addAll()-----------");
		Collection<String> mf=new ArrayList<>();
		mf.add("mango");
		mf.add("grapes");
		mf.add("orange");
		fruits.addAll(mf);
		System.out.println("Fruits after add all(): "+fruits);
		System.out.println("-------------remove()--------");
		fruits.remove("banana");
		System.out.println(fruits);
		Collection<String>removeList=new ArrayList<String>();
		removeList.add("mango");
		removeList.add("cherry");
		removeList.add("carrot");
		System.out.println("----------removeall()--------");
		fruits.removeAll(removeList);
		System.out.println(fruits);
		System.out.println("-----------retainAll()----------");
		Collection<String>retainList=new ArrayList<String>();
		retainList.add("Apple");
		retainList.add("grapes");
		retainList.add("Oragne");
		fruits.retainAll(retainList);
		System.out.println(fruits);
		System.out.println("----------------contains()-------");
		System.out.println(fruits.contains("apple"));
		System.out.println("------------containsAll()-------");
		Collection<String>checkList=new ArrayList<String>();
		checkList.add("apple");
		checkList.add("grapes");
		System.out.println(fruits.containsAll(checkList));
		
		System.out.println("-----------size()---------");
		System.out.println(fruits.size());
		System.out.println("--------------isEmpty()-------");
		System.out.println(fruits.isEmpty());
		System.out.println("-------------toArray()----");
		Object[] fruitsArray=fruits.toArray();
		for(int i=0;i<fruitsArray.length;i++)
		{
			System.out.println(fruitsArray[i]+" ");
		}
		System.out.println();;
		System.out.println("---------iterator()-----------");
		System.out.println("Iterator using iterator");
		Iterator<String>it=fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		fruits.clear();
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		
	}
} 
