package OOP;

public class Pcircle extends PolyShape
	{
	
		private int radius;
		
		public Pcircle() {}
		
		public Pcircle(int r)
		{
			radius = r;
		}
		
		public double area()
		{
			double ar = PolyShape.PIE*radius*radius;
			return ar;
		}
		public static void main(String[] args) 
		{
			PolyShape c = new Pcircle(5);
			
			c.setBorderWidth(9);
			c.setColor("Red");
			double x = c.area();
			System.out.println("area of cirlce : "+x);
		}
		
		
	}
	

