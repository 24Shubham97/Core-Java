package CalenderProgram;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateCompare {

	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1 = dateformat.parse("07/01/2021");
		Date d2 = dateformat.parse("07/10/2020");
		
		System.out.println("1st date = "+dateformat.format(d1));
		System.out.println("2nd date = "+dateformat.format(d2));
		
		if(d1.compareTo(d2)>0)
		{
			System.out.println("1st date is before 2nd date");
		}
		else if(d1.compareTo(d2)<0)
		{
			System.out.println("2nd date is after 1st date");
		}
		if(d1.compareTo(d2)==0)
		{
			System.out.println("1st date and 2nd date are equal");
		}

	}

}
