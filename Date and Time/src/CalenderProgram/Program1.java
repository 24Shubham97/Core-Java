package CalenderProgram;

import java.util.Calendar;


public class Program1 
{

	public static void main(String[] args) 
	{
			
		Calendar cal = Calendar.getInstance();
		System.out.println("Current date : "+cal.getTime());
		
		cal.add(cal.YEAR, -20);
		System.out.println("before 20 years : "+cal.getTime());
		
		cal.add(cal.DATE, -1);
		System.out.println("yesterday = "+cal.getTime());
	}

}
