package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {
		try {
		PrintWriter out=new PrintWriter("abc.txt");
		out.print("hai");
		out.println(2);
		out.write("hello appu");
		out.print(100);//direct number
		out.write(100);//ascii
		out.println("codegnan");
		out.flush();//without missing any character flush write all the matter into the file
		System.out.println("Data written successful");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
