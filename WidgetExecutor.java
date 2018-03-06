package com.ibm.training.springblock.oopsprograms;

public class WidgetExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Widget w1=new Widget();
		Widget w2=new Widget();
		Widget w3=new Widget();
		System.out.println("main method");
		System.out.println(Widget.getNumberofwidgets());
		System.out.println(w2.getNumberofwidgets());
		
		System.out.println(w3.getNumberofwidgets());
	}

}
