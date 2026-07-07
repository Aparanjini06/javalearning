package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {
	public static void main(String[] args) {
		List<Person>people =new ArrayList<>();
		people.add(new Person("Appu",22,"hyd"));
		people.add(new Person("srujana",32,"vsp"));
		people.add(new Person("prani",21,"bng"));
		try(PrintWriter out =new PrintWriter("people.csv"))
		{
			out.print("name,age,city");
			out.println();
			for(Person person:people)
			{
				out.print(person.toCSV());
				out.println();
			}
			System.out.println("person object writen successfullt to people.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
