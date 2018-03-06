package com.ibm.training.springblock.oopsprograms;

public class Marker {

 private String color;
 private int height;
 
 public Marker(String color, int height) {
	this.color = color;
	this.height = height;
}

public Marker(){
	 System.out.println("default called");
 }
 
 
 
 public Marker(String color){
	 this.color=color;
 }
	public void write() {
		System.out.println("Writing"+color);
	}
	
	

}
