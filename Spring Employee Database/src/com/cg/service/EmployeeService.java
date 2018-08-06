package com.cg.service;

import java.util.List;
import java.util.Map;

import com.cg.Employee.Employee;
import com.cg.dao.EmployeeDAO;

public class EmployeeService {
	
	private EmployeeDAO dao;
	

	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	public void addEmployee(Employee employee)
	{
		dao.addEmployee(employee);
	}
	public List<Employee> viewAllEmployee()
	{
		return dao.viewAllEmployee();
	}
	
	public Employee getEmpById(int id)
	{
		return dao.getEmpById(id);
	}
	
//	public int deleteEmp(int id)
//	{
//		return dao.deleteEmp(id);;
//	}
}
