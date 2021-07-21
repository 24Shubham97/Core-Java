package OOP;

public class Polyrec extends PolyShape
{
	private int length = 0;
	private int width = 0;
	
	public Polyrec() {};
	
	public Polyrec(int l,int w)
	{
		length = l;
		width = w;
	}
	
	public double area()
	{
		double ar = length*width;
		return ar; 		
	}
	
	public static void main(String[] args) 
	{
		PolyShape r = new Polyrec(5,10);
		
		r.setBorderWidth(9);
		r.setColor("green");
		double area = r.area();
		System.out.println("area of rectangle : "+area);
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
	}

	
	}

