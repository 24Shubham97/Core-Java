// WAP a program to reverse digits of a given number.

package com.corejava.basic;

public class Program5 {

	public static void main(String[] args)
	{
		int n=449456,r,s=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
					
		}
		System.out.println(s);

	}

}
