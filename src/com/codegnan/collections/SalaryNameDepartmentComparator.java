package com.codegnan.collections;

import java.util.Comparator;

public class SalaryNameDepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpSalary()<e2.getEmpSalary())
		{
			return -10;
		}
		else
		{
			if(e1.getEmpSalary()>e2.getEmpSalary())
			{
				return 10;
			}
			else
			{
				int result=e1.getEmpName().compareTo(e2.getEmpName());
				if(result!=0)
				{
					return result;
				}
				else
				{
					return e1.getEmpAddress().compareTo(e2.getEmpAddress());
					
				}
			}
		}
	}

}
