// WAP to find sum of all integers 
package com.corejava.basic;

public class Program7 {

	public static void main(String[] args) 
	{
		int a=196;
		int l=105;
		int n=0,sum=0;
		while(n/7==0)
		{
			n= ((a-l)/7)+1;
			sum= (n/2)*(196+105);
			
			
		}
		System.out.println(sum);
		System.out.println(n);

	}

}
