package com.ibm.training.basicprograms;

public class SpaceCount
{
    
    static int i,c=0,res;
    
    
    static int spacecount(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=SpaceCount.spacecount("i am adult ");
        //string is always passed in double quotes
        
        System.out.println("The number of white spaces  in the String are :  "+res);
    }
}