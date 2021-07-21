package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersontTest {

	public static void main(String[] args) throws ParseException 
	{
		Person p = new Person();
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String str = "24/01/1997";
		Date d1 = sdf.parse(str);
		p.setDOB(d1);
		
		Date d2 = p.getDOB();
		
		p.setName("Shubham Bairagi");
		p.setAddress("Indore");
		
		
		 
		 
		 System.out.println("Name = "+p.getName());
		 System.out.println("DOB = "+ sdf.format(d2));
		 System.out.println("Address = "+p.getAddress());
	}

}
