package com.ibm.training.basicprograms;
import java.util.*;

public class FisrtAndLast {
	// Java Program to find first and last
	// digits of a number   
	    // Find the first digit
	    public static int firstDigit(int n)
	    {
	        // Remove last digit from number
	        // till only one digit is left
	        while (n >= 10) 
	            n /= 10;
	        return n;
	    }
	 
	    // Find the last digit
	    public static int lastDigit(int n)
	    {
	        // return the last digit
	        return (n % 10);
	    }
	     
	    // driver function
	    public static void main(String argc[])
	    {
	        int n = 98562;
	        int result=firstDigit(n)*lastDigit(n);
	        System.out.println(firstDigit(n) + " "
	        + lastDigit(n));
	        System.out.println(result);
	    }
	}

