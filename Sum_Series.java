package com.ibm.training.basicprograms;

import java.util.Scanner;
public class Sum_Series 
{
    public static void main(String[] args) 
    {
        double sum = 0;
        int n;
        System.out.println("3!/1 + 4!/2 + 5!/3 + ..(n+2)!/n");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = s.nextInt();
        Sum_Series obj = new Sum_Series();
        for(int i = 1; i <= n; i++)
        {
            sum = sum + (obj.fact(i+2)) / i;
        }
        System.out.println("Sum of series:"+sum);
    }
    int fact(int x)
    {
        int mul = 1;
        while(x > 0)
        {
            mul = mul * x;
            x--;
        }
        return mul;
    }
}