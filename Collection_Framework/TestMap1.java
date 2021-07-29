package Collection_Framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class TestMap1 
{
	public static void main(String[] args) 
	{
		//Map m = new Hashtable<>();  // HashTable = decreasing order
		Map m = new Properties();	// Properties = decreasing order
		m.put(1, 142);
		m.put(2, "Ankit");
		m.put(3, 52.4);
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
