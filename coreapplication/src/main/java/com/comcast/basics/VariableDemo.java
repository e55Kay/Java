package com.comcast.basics;

class Employee {
	long empId = 1025;
	double empSalary = 45000;
	float empTax = 14.5f;
	int empDaysOfWork = 24;
	
	void calculatePF()
	{
		float pfRate = 10.5f;
		
		System.out.println("The PF Rate of the Employee is " + pfRate);
	}
}

public class VariableDemo {

	public static void main(String[] args) {
		Employee emp = null;
		emp = new Employee();
		
		System.out.println("The Id of the Employee is " + emp.empId);
		System.out.println("The Salary of the Employee is  " + emp.empSalary);
		System.out.println("The Percentage of Tax the Employee needs to pay is " + emp.empTax);
		System.out.println("The Total Number of working days is " + emp.empDaysOfWork);
		
		emp.calculatePF();

	}

}
