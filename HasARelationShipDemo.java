package com.ibm.training.springblock.oopsprograms;
/*
 * 
 * @author Shwetha
 */
public class HasARelationShipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad1=new Address(233, "Rajajinagar", "Bangalore", "India", 560010);	
		Employee_New e1=new Employee_New(101, "Manish", 768768, ad1);
		e1.getEmployeeDetails();
		ad1.getAddress();

	}

}
