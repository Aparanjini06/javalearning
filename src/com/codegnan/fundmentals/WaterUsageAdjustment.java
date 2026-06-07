package com.codegnan.fundmentals;

import java.util.Scanner;

public class WaterUsageAdjustment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//S1: Read number of stations and number of queries
		int numOfStations=s.nextInt();
		int numOfQueries=s.nextInt();
		//s2:Read initial water usage of each station
		int[] waterUsage = new int[numOfStations];
		
		for(int i=0;i<numOfStations;i++) {
			waterUsage[i]=s.nextInt();
		}
		//s3: Process each query adjustment
		for(int i=0;i<numOfQueries;i++)
		{
			int startStation=s.nextInt();//1-based index
			int endStation=s.nextInt();//1-based
			int adjustment=s.nextInt();//positive or negative
			//apply adjustment of all stations in the range[L,R]
			for(int j=startStation-1;j<endStation;j++) {
				waterUsage[j]+=adjustment;
				if(waterUsage[j]<0) {
					waterUsage[j]=0;
					
				}
			}
		}
		//s4: display the final water usage of all students
		for(int i=0;i<numOfStations;i++) {
			System.out.print(waterUsage[i]+" ");
		}
		s.close();
				
	}

}
