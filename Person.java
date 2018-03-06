package com.ibm.training.springblock.oopsprograms;

public class Person {
	protected String name;
	long ph_no;
	String address;
	
	public Person(String name,long ph_no,String address){
		this.name=name;
		this.ph_no=ph_no;
		this.address=address;
	}
	
	public void display() {
		System.out.println("person details");
		System.out.println(" "+name+" "+ph_no+" "+address);
	}

}
