package com.cg.Employee;



/*Employee emp=new Employee(101,"Udit",25000);
*/

public class Employee {
	
	private static int id;
	private String name;
	private String designation;
	private static int count;
	private double salary;
	static {
		count=100;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	

	
	
	

}
