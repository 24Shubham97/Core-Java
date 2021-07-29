package Collection_Framework;

import java.util.ArrayList;
//convert object into String Program.
public class toString1 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList<>();
		
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		
		int size = a.size();
		
		
		  for (int i = 0; i < size; i++) 
		  { 
			  //System.out.println(i + " : "+a.get(i)); --> Its 1st method
				/*
				 * Object o = a.get(i); System.out.println(i + " : "+o); --> Its second method
				 */
			 Object o =  a.get(i);
			 System.out.println(i+ " : "+o.toString()); // -->3rd method 
		  }
		 
	}
}
