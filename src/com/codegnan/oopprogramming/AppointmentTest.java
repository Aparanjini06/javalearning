package com.codegnan.oopprogramming;

public class AppointmentTest extends Appointment{
public static void main(String[] args) {
	Appointment ap=new Appointment();
	ap.schedule();
	DoctorAppointmemt dap=new DoctorAppointmemt();
	
	dap.schedule();
	DentistAppointment dp=new DentistAppointment();
	dp.schedule();
}
}
