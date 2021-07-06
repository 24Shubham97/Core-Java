package CalenderProgram;
import java.util.*;
import java.text.*;

public class Demo
{

	public static void main(String[] args) 
	{
		String s = "24/01/1997";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.getTime(Calendar.YEAR);
		int month = c.getTime(Calendar.MONTH);
		int date = c.getTime(Calendar.DATE);
		LocalDate l1 = LocalDate.of(date, month, year);
		LocalDate now1 = LocalDate.now();
		Period diff = Period.between(l1, now1);
		System.out.println("age: "+diff.getYears()+"years");
	}

}
