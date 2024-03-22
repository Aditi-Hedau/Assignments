package org.employee.in;

public class Employee {
	
	public void display(int employeeId) 
	{
	        System.out.println("Employee ID: " + employeeId);
	}

	public void display(double salary) 
	{
	        System.out.println("Employee Salary: " + salary);
	}

	public void display(String employeeName) 
	{
	        System.out.println("Employee Name: " + employeeName);
	}

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.display(1023); 
        emp.display(50000.45); 
        emp.display("Sameer"); 
	}

}
