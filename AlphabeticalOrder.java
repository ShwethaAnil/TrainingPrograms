package com.ibm.training.basicprograms;

import java.util.*;
public class AlphabeticalOrder
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the String : ");
String st = in.nextLine();
int l = st.length();
st=st.toLowerCase();
for(int i = 91;i<=122;i++)
{
for(int j=0;j<l;j++)
{
char ch = st.charAt(j);
if(i==ch)
System.out.print((char)i+"");
}

}
}
}