package OOP;

public class Ptriangle extends PolyShape 
{
	private int base = 0;
	private int height = 0;
	
	public Ptriangle( ) {}
	
	public Ptriangle(int b, int h)
	{
		base = b;
		height = h;
	}
	public double area()
	{
		double ar = 0.5*base*height;
		return ar;
	}
	
	public static void main(String[] args) 
	{
		PolyShape t = new Ptriangle(5,4);
		
		t.setBorderWidth(6);
		t.setColor("white");
		double area = t.area();
		System.out.println(area);
	}
}
