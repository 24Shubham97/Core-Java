package CalenderProgram;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
public class dobfromnow {

	public static void main(String[] args) throws ParseException 
	{
		  String s = "24/01/1997";
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  Date d = sdf.parse(s);
		  Calendar c = Calendar.getInstance();
		  c.setTime(d);
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH);
		  int date = c.get(Calendar.DATE);
		  LocalDate l1 = LocalDate.of(date, month, year);
		  LocalDate now1 = LocalDate.now();
		  Period diff1 = Period.between(l1, now1);
		  System.out.println("age: " + diff1.getYears() + " years");

	}

}
