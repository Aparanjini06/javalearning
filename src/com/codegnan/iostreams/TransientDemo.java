package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		ATMCard original=new ATMCard(1456782345,1234,"12/30",654,"appu");
		try(ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("atm.ser")))		
		{
			oos.writeObject(original);
			System.out.println("Object Serialized : "+original);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ATMCard deserializedCard=null;
		try(ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream("atm.ser")))
		{
			deserializedCard =(ATMCard)ois.readObject();
			System.out.println("Transient:"+deserializedCard);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
