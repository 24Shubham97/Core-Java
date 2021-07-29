package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest 
{
	public static void main(String[] args) 
	{
		List a = new ArrayList<>();
		
		a.add("Shubham");
		a.add("Ravi");
		a.add("Jay");
		a.add("Mukesh");
		
		Iterator it = a.iterator();
		
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		
		
	}
}
