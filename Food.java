package com.ibm.training.oopsprograms;

public abstract class Food {

	public static final String who_m_i="I am Eatable";
	
	
	public Food()
	{
		System.out.println("IS A FOOD");
	}
	
	public abstract String consume();
	public abstract String taste();
	
	/* abstract class can also have non abstract methods
	 * with any access specifier
	 */
	
	protected void prepareToEat()
	{
		wash();
		System.out.println("clean your hands");
	}
	
	private void wash()
	{
		System.out.println("Have you washed your hands");
	}
}
