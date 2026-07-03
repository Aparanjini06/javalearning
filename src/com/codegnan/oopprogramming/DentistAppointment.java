package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DentistAppointment extends Appointment{
	public void schedule() {
		Scanner s=new Scanner(System.in);
		System.out.print("Dental procedure:");
		String procedure=s.next();
		System.out.println("Dentist appointment schedule for "+procedure);
		s.close();
		}
	
	
}
