package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsPersonTest {

	public static void main(String[] args) throws Exception 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
	    ConsPerson c = new ConsPerson("Shubham","bairagi","24/01/1997","Gwalior");
		
		Date y = c.getDob(); 
		
		System.out.println(sdf.format(y));
		
	}

}
