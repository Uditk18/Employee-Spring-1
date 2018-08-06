package com.cg.dao;

import java.util.ArrayList;
import java.util.List;
import com.cg.Employee.Employee;

public class EmployeeDAO {
	
//	Employee EmpDetails;
	
	List<Employee> employeeList=new ArrayList<>();
	
	
	public void addEmployee(Employee emp)
	{
		employeeList.add(emp);
	}
	
	public List<Employee> viewAllEmployee()
	{
		return employeeList;
//		for(Entry e: EmpSet)
//		{
//			System.out.println("Details : "+e.getValue()+" "+e.getKey());
//		}
	}
	
	@SuppressWarnings("unchecked")
	public Employee getEmpById(int id)
	{
		
		for(Employee e: employeeList)
		{
		if(e.getId()==id)
			return e;
		}
		return null;
	}
	
//	public void deleteEmp(Integer id)
//	{
//		for(Entry e: EmpSet)
//		{
//		Predicate<? super Entry<Integer, Employee>> pred = (Employee) -> e.getKey().equals(id);
//		EmpSet.removeIf(pred);
//		
//		
//	}
//	}
}
