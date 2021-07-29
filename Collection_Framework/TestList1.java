package Collection_Framework;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList1 
{
	public static void main(String[] args) 
	{
		//List l = new LinkedList<>();  // Same for ArrayList,vector and LinkedList as well
		List l = new Vector<>();
		l.add(1);
		l.add(5);
		l.add(100);
		l.add(102);
		l.add(340);
		l.add(null);
		System.out.println(l);
		l.add(3, "Shubham");
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		System.out.println(l.remove(4));
		
		System.out.println(l.set(4, "Bairagi"));
		System.out.println(l);
		
		System.out.println(l.indexOf(3));
		System.out.println(l);
		
		System.out.println(l.indexOf(100));
		System.out.println(l.lastIndexOf(5));
		
		System.out.println(l.subList(1, 3));
		
	}
}
