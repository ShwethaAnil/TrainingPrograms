package com.ibm.training.oopsprograms;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating object of carrot halwa");
		Food carrot_halwa=new CarrotHalwa();
		System.out.println("-------------------------------------------------");
		
	
		System.out.println(carrot_halwa.consume());
		
		System.out.println("-------------------------------------------------");
		System.out.println("Creating object of CarrotHalwa using reference of CarrotHalwa");
		CarrotHalwa carrot_halwa1=new CarrotHalwa();
		carrot_halwa1.makeHalwa();
		System.out.println(carrot_halwa1.consume());
		
	}

}
