package com.ibm.training.springblock.oopsprograms;

public class Employee extends Person {
	int emp_id;
	double salary;
	
	public Employee(String name,long ph_no,String address,int emp_id,double d) {
		super(name,ph_no,address);
		this.emp_id=emp_id;
		this.salary=d;
	}
	
	public void display() {
	
		System.out.println("Employee details");
		System.out.println(" "+name+" "+emp_id+" "+salary);
	}
	
	
	

}
