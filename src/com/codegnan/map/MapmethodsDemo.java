package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapmethodsDemo {
	public static void main(String[] args) {
		Map<String,Integer>s=new HashMap<>();
		s.put("Arjun", 98);
		s.put("Priya", 88);
		s.put("Ravi", 92);
		s.put("Sita", 79);
		s.put("Rahul", 91);
		Map<String,Integer>s1=new HashMap<>();
		s1.put("Ananya", 95);
		s1.put("Vikram", 82);
		s1.put("Meera",87);
		s.putAll(s1);
		System.out.println(s);
		System.out.println("marks of Arjun: "+s.get("Arjun"));
		System.out.println("Removed priya marks : "+s.remove("priya"));
		System.out.println("Is sita preseny? : "+s.containsKey("sita"));
		System.out.println("Any student scored 100? : "+s.containsValue(100));
		System.out.println("is Map is empty ? "+s.isEmpty());
		System.out.println("Total Students :" +s.size());
		Set<String> studentNames=s.keySet();
		//Map<String,Integer>s=new HashMap<>();
		System.out.println("Student Names: "+studentNames);
		Collection<Integer> marks=s.values();
		System.out.println("Marks: "+marks);
		Set<Map.Entry<String, Integer>>entries=s.entrySet();
		System.out.println("All entries");
		for(Map.Entry<String, Integer>entry:entries)
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		s.clear();
		System.out.println("Map is Empty : "+s.isEmpty());
		
	}
}
