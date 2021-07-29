package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class TestSet1 
{
	public static void main(String[] args) 
	{
		Set s = new TreeSet(); // TreeSet gave the output in a sequence order.
		
		s.add("Shubham");
		s.add("Neeraj");
		s.add("Shubham");
		s.add("Lucky");
		//s.add(37);
		//s.add(67);
		
		s.add("shubham");
		
		System.out.println("Sorting or Increment order ="+s);
	}
}
