import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Demo1 {

	public static void main(String[] args) 
	{
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");
		System.out.println(format1.format(today));
	}

}
