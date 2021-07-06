import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Program6 {

	public static void main(String[] args) throws ParseException 
	{
		Date today = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 System.out.println("format1 = "+format1.format(today));
		
		SimpleDateFormat format2 = new SimpleDateFormat("MMM dd,yyyy");
		System.out.println("format2 = "+format2.format(today));
		
		Date pDate = format1.parse("24/01/1997");
		System.out.println(pDate);
	}

}
