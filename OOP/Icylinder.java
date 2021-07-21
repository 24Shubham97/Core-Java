package OOP;

public class Icylinder extends InheritShape
{
	private int radius = 0;
	private int height = 0;
	
	public Icylinder()
	{
		System.out.println("default constructor");
	}
	public Icylinder(int r,int h)
	{
		radius=r;
		height=h;
	}
	
	public double volume()
	{
		double vol = InheritShape.PI*radius*radius*height;
		return vol;
	}
	public int getRadius() {
		return radius;
	}
	
	public int getHeight() {
		return height;
	}
		
	public static void main(String[] args) 
	{
		Icylinder c = new Icylinder(4,5);
		
		c.setColor("Green");
		c.setBorderWidth(5);
		
		double volume = c.volume();
		
		System.out.println("Volume of Cylinder : "+volume);
		
	}
}
