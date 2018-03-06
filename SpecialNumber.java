package com.ibm.training.basicprograms;
import java.util.*;
import java.io.*;
public class SpecialNumber {
	    // function to calculate the factorial
	    // of any number
	    static int factorial(int n)
	    {
	        int fact = 1;
	        while (n != 0)
	        {
	            fact = fact*n;
	            n--;
	        }
	        return fact;
	    }
	 
	    // function to Check if number is krishnamurthy
	    static boolean isSpecialNumber(int n)
	    {
	        int sum = 0;
	 
	        int temp = n;
	        while (temp != 0)
	        {
	            // calculate factorial of last digit
	            // of temp and add it to sum
	            sum += factorial(temp%10);
	 
	            // replace value of temp by temp/10
	            temp = temp/10;
	        }
	 
	        // Check if number is krishnamurthy
	        return (sum == n);
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        if (isSpecialNumber(n))
	            System.out.println("Special Number"+n);
	        else
	            System.out.println("NOt a Special Number"+n);
	    }
	}