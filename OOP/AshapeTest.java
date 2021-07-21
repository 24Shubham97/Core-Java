package OOP;

public class AshapeTest extends AShape 
{
	@Override
	public double area() 
	{
		double ar = PolyShape.PIE*radius*radius;
		return ar;

		
	}
	private int radius;
	
	public AshapeTest() {}
	
	public AshapeTest(int r)
	{
		radius = r;
	}
	
	
	
	public static void main(String[] args) 
	{
		AShape a = new AshapeTest(5);
		
		a.setBorderWidth(9);
		a.setColor("Red");
		double x = a.area();
		System.out.println("area of cirlce : "+x);
	}

}
