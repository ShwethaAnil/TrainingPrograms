package com.ibm.training.springblock.oopsprograms;

public class Widget {

	private  int w_id;
	private static int  number_of_widgets=0;
	
	static {
		System.out.println("test of static");
	}
	public Widget() {
	w_id=++number_of_widgets;
	}
	
	public int getW_id() {
		return w_id;
	}
	
	public static int getNumberofwidgets() {
		return number_of_widgets;
	}
	
	
	
}
