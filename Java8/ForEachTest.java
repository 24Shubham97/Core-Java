package Java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest 
{
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		list.forEach(li -> System.out.println(li));
	}
}
