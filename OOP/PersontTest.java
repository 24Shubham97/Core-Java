package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersontTest {

	public static void main(String[] args) throws ParseException 
	{
		Person p = new Person();
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		 p.setName("Shubham");
		 String d = "24/01/1997";
		 Date d1 = sdf.parse(d);
		 p.setDOB(d1);
		 
		 Date c = p.getDOB();
		 p.setAddress("Indore");
		 String k = sdf.format(d1);
		// System.out.println("Original date="+k);
		 p.setDOB(c);
		 
		 Date f = p.getDOB();
		 
		// System.out.println(k);
		 
		 
		 System.out.println("Name = "+p.getName());
		 System.out.println("DOB = "+ sdf.format(f) );
		 System.out.println("Address = "+p.getAddress());
	}

}
