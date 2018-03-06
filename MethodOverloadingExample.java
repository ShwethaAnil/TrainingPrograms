package com.ibm.training.springblock.oopsprograms;

public class MethodOverloadingExample {
	
	/*int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	float add(float num1,int num2) {
		float sum=num1+num2;
		return sum;
	}*/
	
	void getDetails(String name,int salary) {
		System.out.println(" "+name+" "+salary);
	}
	void getDetails(int salary,String name) {
		System.out.println(" "+salary+" "+name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample m1=new MethodOverloadingExample();
		//System.out.println(m1.add(34, 78));
		m1.getDetails(1200, "Shwetha");
		m1.getDetails("Anitha", 1500);
		

	}

}
