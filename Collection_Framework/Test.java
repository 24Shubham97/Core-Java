package Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// Synchronisation : Synchronisation is the method for thread synchrosation. when more than one user access the only one seat than we used it.
public class Test 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList<>();
		
		l.add("java");
		System.out.println(l.hashCode());
	}
}
