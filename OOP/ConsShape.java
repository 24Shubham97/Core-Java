package OOP;

public class ConsShape 
{
	private String color = "null";
	private int borderwidth = 0;
	
	public static final double PI = 3.14;
	public ConsShape()
	{
		System.out.println("This is default Constructor");
	}
	public ConsShape(String c, int w)
	{
		color = c;
		borderwidth = w;
		
		System.out.println(c);
		System.out.println(w);
		
	}
}
