import java.text.SimpleDateFormat;
import java.util.Date;
//import java.text.SimpleDateFormat;

public class Program3 
{
	public static void main(String arg[])
	{
		
		Date today = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		String strDate = format1.format(today);
		
		System.out.println("Format = "+strDate);
		
		//Date pDate = format1.parse("24/01/1997");
		//System.out.println(pDate);
	}

}
