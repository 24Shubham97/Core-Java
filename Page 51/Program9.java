package com.corejava.basic;

public class Program9 {

	public static void main(String[] args) 
	{
		int  a[][] = new int[9][10];
		int result;
		for(int i=2;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				result = i*j;
				System.out.println(result);
			}
			System.out.println("");
		}

	}

}
