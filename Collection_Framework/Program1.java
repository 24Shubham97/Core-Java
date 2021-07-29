package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Program1 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(1);
		l.add(3.5);
		l.add("Shubham");
		l.add(1.33333333333);
		System.out.println(l);
		
		List a = new ArrayList();
		a.add(2);
		a.add("Shubham");
		a.add(44);
		//a.addAll(l);
		
		//a.clear();
		//System.out.println(a);
		System.out.println(a.size());
		
		System.out.println(l.contains("Ankit"));
		System.out.println(a.contains(3.5));
		System.out.println(a.containsAll(l));
		
		System.out.println(l.isEmpty());
		
		/*
		 * System.out.println(l.remove(3)); l.removeAll(a); System.out.println(l);
		 */
		l.retainAll(a);
		System.out.println(l);
		
		
		
	}
}
