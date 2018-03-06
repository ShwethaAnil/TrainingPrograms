package com.ibm.training.basicprograms;

public class StringCount {

	public static void main(String...s)
	 {
	  int word=1;
	  String str="count number of words and sapces";
	 
	  for(int i=0;i<str.length();++i)
	  {
	   if(str.charAt(i)==' ')
	    word++;
	  }
	 
	  System.out.println("Number of words="+word);
	  System.out.println("Number of spaces="+(word-1));
	  int spaces=word;
	  int letters=str.length()-spaces;
	 System.out.println("Number of letters= "+letters);
	 }

}
