package com.comcast.fundamentals;

class Employee {
	int empId;
	String empName;
	String designation;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int empId) {
		this.empId = empId;
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Employee(int empId, String empName, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp2 = new Employee(21);
		Employee emp3 = new Employee(22,"Rohit");
		Employee emp4 = new Employee(23,"Manish", "Developer");
		
		System.out.println(emp.empId + " | " + emp.empName + " | " + emp.designation);
		System.out.println(emp2.empId + " | " + emp2.empName + " | " + emp2.designation);
		System.out.println(emp3.empId + " | " + emp3.empName + " | " + emp3.designation);
		System.out.println(emp4.empId + " | " + emp4.empName + " | " + emp4.designation);

	}

}
