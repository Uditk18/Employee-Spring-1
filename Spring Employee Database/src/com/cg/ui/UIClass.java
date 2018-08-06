package com.cg.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Employee.Employee;
import com.cg.controller.EmployeeController;

public class UIClass {
	
	
	private static EmployeeController empController;
	
	public void setEmpController(EmployeeController empController) {
		this.empController = empController;
	}

	static Employee EmpDetails;

	
	public static void giveInput() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		empController = (EmployeeController) context.getBean("empController");
				
		
		Scanner scanner=new Scanner(System.in);
		do {
		System.out.println(" Please enter your choice:");
		System.out.println(" 1. Enter new employee");
		System.out.println(" 2. View employee list");
		System.out.println(" 3. Get employee by id");
		System.out.println(" 4. Delete employee by id");
		int choice = scanner.nextInt();
		
		
			switch(choice)
		{
		
		case 1: 
			EmpDetails = new Employee();
				System.out.println(" Enter Name : ");
				String name=scanner.next();
				EmpDetails.setName(name);
				
				System.out.println(" Enter Designation : ");
				String design=scanner.next();
				EmpDetails.setDesignation(design);
				
				System.out.println(" Enter Salary : ");
				double salary=scanner.nextDouble();
				EmpDetails.setSalary(salary);
				
				empController.addEmployee(EmpDetails);
		
				break;
		
		case 2: display();
				break;
				
		case 3: System.out.println("Enter emp id");
				int id=scanner.nextInt();
				if(empController.getEmpById(id)==null)
				{
					System.out.println("Employee with id "+id+" is not there");
				}
				else
				{
					System.out.println(empController.getEmpById(id));
				}
		
				break;
				
//		case 3: System.out.println("Enter emp id which you want to delete");
//		
//
//		break;
				
		}
		
		}while(true);
	}
	
	public static void display()
	{
		System.out.println(" Employee details are: ");
		empController.viewAllEmployee().stream().forEach(System.out::println);
		
		
	}
}
