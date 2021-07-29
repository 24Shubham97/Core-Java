package Collection_Framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestMap 
{
	public static void main(String[] args) 
	{								// Hashmap is the same of HashTable.
		//Map m = new HashMap<>();  // Hashmap = Increasing order
		Map m = new Hashtable<>();							// HashTable = Decreasing order
		m.put(1, "Shubham");
		m.put(2, "Ankit");
		m.put(3, "Neeraj");
		m.put(4, "Lucky");
		
		System.out.println(m);
		
		System.out.println(m.containsKey(5));
		
		System.out.println(m.containsValue("Neeraj"));
		
		System.out.println(m.entrySet());
		
		System.out.println(m.get(3));
		
		System.out.println(m.remove(2));
		System.out.println(m);
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());
		
		System.out.println(m.size());
		
		System.out.println(m.values());
	}
}
