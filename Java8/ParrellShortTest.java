package Java8;

import java.util.Arrays;

public class ParrellShortTest 
{
	public static void main(String[] args) {
		
	
	int a[] = {02,48,66,808,5,109,30,700,906};
	
	
	Arrays.parallelSort(a);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
}
}