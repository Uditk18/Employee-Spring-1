package com.cg.controller;
import java.util.List;

import com.cg.Employee.Employee;
import com.cg.service.EmployeeService;

public class EmployeeController {
	
	private EmployeeService EmpService;
	Employee EmpDetails;
	int id;
	
	public void setEmpService(EmployeeService empService) {
		EmpService = empService;
	}
	public void addEmployee(Employee employee)
	{
		EmpService.addEmployee(employee);
	}
	public List<Employee> viewAllEmployee()
	{
		return EmpService.viewAllEmployee();
	}
	
	public Employee getEmpById(int id)
	{
		return EmpService.getEmpById(id);
	}
	
//	public int deleteEmp(int id)
//	{
//		return ((EmployeeController) EmpService).deleteEmp(id);
//	}
}