package OOP;

public class Itrangle extends InheritShape
{
	private int base = 0;
	private int height = 0;
	 
	public Itrangle()
	{
		System.out.println("default constructor");
	}
	public Itrangle(int b,int h)
	{
		base = b;
		height = h;
		
	}
	
	public double area()
	{
		 double ar = 0.5*base*height;
		return ar;
	}
	
	
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}
	

	public static void main(String[] args) 
	{
		Itrangle t = new Itrangle(4,5);
		
		t.setBorderWidth(5);
		t.setColor("white");
		double area = t.area();
		
		System.out.println("Area of traingle : "+area);
		System.out.println("color : "+t.getColor());
		System.out.println("BorderWidth : "+t.getBorderWidth());
		
		
		
		
		 
		
	}

}
