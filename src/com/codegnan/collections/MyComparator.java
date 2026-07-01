package com.codegnan.collections;

import java.util.Comparator;

public class MyComparator implements Comparator{
	@Override
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
		/*Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		if(i1<i2)
		{
			return +1;
		}
		else
		{
			if(i1>i2)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		return -i1.compareTo(i2);
		*/
		
	}
}
