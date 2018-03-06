package com.ibm.training.basicprograms;
 // Import for Scanner
import java.util.*;


public class CountRepeat
{

 public static void main(String args[])
 {

 // Create Scanner object
 Scanner s=new Scanner(System.in);
 String st=s.nextLine();
 String find=s.nextLine();
 int count=0;
 int k=0;
  for(int i=0;i<st.length();i++)
  {
  k=st.toLowerCase().indexOf(find.toLowerCase(),k+find.length());

  System.out.println(k);
   if(k==-1) break; else count++;
  }
 System.out.println("The string occurred "+count+" times");

 }

}