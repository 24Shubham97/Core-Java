// WAP a program to find Factorial of a given number.
package com.corejava.basic;

public class Program4 
{
	public static void main(String[] args) 
	{
		int n=5,fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial = "+fact);
	}

}
