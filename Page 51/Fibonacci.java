package com.corejava.basic;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int a=0,b=1;
		int k=0;
		System.out.print("0 1");
		while(k<50)
		{
			k=a+b;
			System.out.print(" "+k);
			a=b;
			b=k;
		}

	}

}
