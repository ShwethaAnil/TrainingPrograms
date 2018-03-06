package com.ibm.training.springblock.oopsprograms;
class Bank{
	double rate_of_interest;
	public void getRateOfInterest(){
		rate_of_interest=12;
		System.out.println(rate_of_interest);
	}
}

class HDFCBank extends Bank{
	public void getRateOfInterest(){
		rate_of_interest=19;
		System.out.println(rate_of_interest);
	}
	
}
class ICICBank extends Bank{
	public void getRateOfInterest(){
		rate_of_interest=20;
		System.out.println(rate_of_interest);
	}
	
}
public class MainExecutionProgram {

	public static void main(String[] args) {
		ICICBank a1=new ICICBank();
		a1.getRateOfInterest();
		/*
		float f1=12.2f;
		int i1=(int) f1;
		int i=12;
		float f=i;
	*/	Bank b1=new HDFCBank();//upcasting
		b1.getRateOfInterest();
		
		HDFCBank hd=new HDFCBank();
		Bank b2=hd;//upcasting
		if(b2 instanceof HDFCBank) {
		HDFCBank hd1=(HDFCBank)b2;//downcasting
		hd1.getRateOfInterest();
		}
	}

}
