package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class TestList 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(1);
		l.add(2.5);
		l.add("Shubham");
		l.add('S');
		l.add("Rahul");
		System.out.println(l);
		/*
		 * for (Object e : l) { System.out.println(e); }
		 */
		List a = new ArrayList();
		a.add(3);
		a.add("Bairagi");
		a.add('B');
		a.add(3.111111111111);
		a.add("Rahul");
		a.addAll(l);
		System.out.println(a);
		
		//l.clear();
		
		
		
		  System.out.println(l.contains("Shubham"));
		  System.out.println(a.containsAll(l));
		  System.out.println(l.isEmpty());
		  System.out.println(l);
		  System.out.println(l.remove(3));
		  
		  System.out.println(a.removeAll(a));
		  
		  System.out.println(l); 
		  System.out.println(a.addAll(l));
		 
		System.out.println(l.retainAll(a));
		System.out.println(a);
		System.out.println(l);
		
		System.out.println(l.size());
		
	}
}
