package com.ibm.training.basicprograms;

import java.util.Scanner;

public class OppositeCase {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String satr=scanner.nextLine();
	    String newString = "";
	    for (int i = 0; i < satr.length(); i++) {
	        if (Character.isUpperCase(satr.charAt(i))) {
	            newString+=Character.toLowerCase(satr.charAt(i));
	        }else newString += Character.toUpperCase(satr.charAt(i));
	    }
	    System.out.println(newString);
	}

}
