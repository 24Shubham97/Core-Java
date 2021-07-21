package OOP;

// Test of Automoble.

public class AutomobileTest 
{

	public static void main(String[] args) 
	{
		Automobile am = new Automobile();
		
		am.setColor("yellow");
		am.setSpeed(60);
		am.setMake("2010");
		
		
		
		int b=am.getSpeed();
		
		int c = b+10;
		int d = c+10;
		int e = d+10;
		int f = e+10;
		
		if(gear() == 1)
		{
			System.out.println("Speed is = "+b+" kph");
		}
		else if(gear() == 2)
		{
			System.out.println("Speed is  =" +c+" kph");
		}
		else if(gear() == 3)
		{
			System.out.println("Speed is "+d+" kph" );
		}
		else if(gear() == 4)
		{
			System.out.println("Speed is "+e+" kph");
		}
		else
		{
			System.out.println("Speed is 30kph");
		}
		
		
		
		
		  System.out.println("color = "+am.getColor());
		  System.out.println("Speed = "+am.getSpeed());
		//  System.out.println("Gear = "+am.getGear());
		  System.out.println("Make = "+am.getMake());
		 
		
		

	}
	private static int gear()
	{
		return 4;
	}
		
	

}	
