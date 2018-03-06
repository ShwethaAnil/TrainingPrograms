package com.ibm.training.basicprograms;

import java.util.Scanner;

public class InitialsProgram {
	static void buncy(String s)
	{
	int l=s.length();
	char p=0;
	String q=s.charAt(0)+"";
	char c=0;int k=s.lastIndexOf(' ');
	for(int i=0;i<l;i++)
	{
	c=s.charAt(i);
	if(Character.isWhitespace(c))
	{
	p=s.charAt(i+1);q=q+"."+p;
	}
	if(i==k)
	q=q+s.substring(k+2);
	}
	System.out.println("Input :"+s);
	System.out.println("Initials :"+q);
	}
	public static void main(String[] args) {
		InitialsProgram ip=new InitialsProgram();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str1=sc.nextLine();
		buncy(str1);
		
	}

}
