import java.text.*;
import java.util.*;


public class Program5 
{
	public static void main(String arg[])
	{
		Date today = new Date();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		dateformat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(dateformat.format(today));
	}
}
