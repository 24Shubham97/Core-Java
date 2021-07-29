package Collection_Framework;

import java.util.ArrayList;
import java.util.Vector;

public class TestArrayList 
{
	public static void main(String[] args) 
	{
		//ArrayList a = new ArrayList<>();
		Vector a = new Vector<>();
		a.add("one");
		a.add("two");
		a.add("three");
		
		Integer i = new Integer(4);
		
		a.add(i);
		
		Integer value = (Integer)(a.get(3));
		
		System.out.println(value);
		
		System.out.println(a);
		
		
		
	}
}
