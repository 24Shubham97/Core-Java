package Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector<>();
		
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
	}
}
