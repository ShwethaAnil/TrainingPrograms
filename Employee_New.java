package com.ibm.training.springblock.oopsprograms;

public class Employee_New {
	int id,salary;
	String name;
	Address address;
	public Employee_New(int id, String name,int salary, Address address) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	
	public void getEmployeeDetails() {
		System.out.println("employee details");
		System.out.print(id+","+name+","+salary);
	}
	
	

}
