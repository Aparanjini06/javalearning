package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DoctorAppointmemt extends Appointment{ 
	public void schedule() {
		Scanner s=new Scanner(System.in);
		System.out.print("Specialization");
		String specialization=s.next();
		System.out.println("Doctot appointment schedule for "+specialization);
		s.close();
	}

}
