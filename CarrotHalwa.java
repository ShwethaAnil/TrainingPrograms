package com.ibm.training.oopsprograms;

public class CarrotHalwa extends Sweet {

	public CarrotHalwa()
	{
		System.out.println("Carrot Halwa");
	}
	
	@Override
	public void makeHalwa() {
		// TODO Auto-generated method stub
		System.out.println("Search receipe for CARROT HALWA and make it");

	}

	@Override
	public String consume() {
		// TODO Auto-generated method stub
		System.out.println(who_m_i);
		prepareToEat();
		return "eat when hot or cold but not when ice frozen";
	}

}
