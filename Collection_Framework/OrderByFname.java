package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrderByFname implements Comparator<Marksheet> 
{
	public static void main(String[] args) {
		List<Marksheet> l = new ArrayList<Marksheet>();
		
		Marksheet m1 = new Marksheet();
		l.add(m1);
		m1.setFname("Shubham");
		m1.setLname("Bairagi");
		m1.setRollNo("1");
		m1.setPhysics(67);
		m1.setChemistry(54);
		m1.setMaths(85);
		
		Marksheet m2 = new Marksheet();
		l.add(m2);
		m2.setFname("Rakesh");
		m2.setLname("Sharma");
		m2.setRollNo("3");
		m2.setPhysics(65);
		m2.setChemistry(32);
		m2.setMaths(54);
		
		Marksheet m3 = new Marksheet();
		l.add(m3);
		m3.setFname("Rakesh");
		m3.setLname("Jain");
		m3.setRollNo("5");
		m3.setPhysics(65);
		m3.setChemistry(58);
		m3.setMaths(87);
		
		Marksheet m4 = new Marksheet();
		l.add(m4);
		m4.setFname("Vijay");
		m4.setLname("Pal");
		m4.setRollNo("2");
		m4.setPhysics(53);
		m4.setChemistry(42);
		m4.setMaths(23);
		
		Marksheet m5 = new Marksheet();
		l.add(m5);
		m5.setFname("Rakesh");
		m5.setLname("Yadav");
		m5.setRollNo("4");
		m5.setPhysics(52);
		m5.setChemistry(43);
		m5.setMaths(31);
		
		
		Collections.sort(l,new OrderByFname ());
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
			
	
}
	}

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		if(o1.getFname().equals(o2.getFname()) == true)
		{
			return o1.getLname().compareTo(o2.getLname());
		}
		
		  return o1.getFname().compareTo(o2.getFname()); 
		 
	}
	
}
