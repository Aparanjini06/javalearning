package com.codegnan.fundmentals;

public class FrequencyCountA {

	public static void main(String[] args) {
		int[] array= {1,2,3,2,1,2,3,1,2,3,4,4,1};
		//boolean array to keep track of elements that have been already counted.
		boolean[] proceed=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(proceed[i]) {
				continue;
			}
			
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]==array[i]) {
					count++;
					proceed[j]=true;
				}
			}
			System.out.println(array[i]+" occurs "+count+" times");
		}
	}

}
