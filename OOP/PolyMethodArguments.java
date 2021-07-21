package OOP;

// Using Polymorphism for Method Arguments

public class PolyMethodArguments 
{
	public static void main(String[] args) 
	{
		PolyShape[] s = new PolyShape[2];
		
		s[0] = new Pcircle(5);
		//p[1] = new Prectangle(4,5);
		s[1] = new Ptriangle(4,3);
		
		double totalArea = calcArea(s);
		System.out.println(totalArea);

	}
	public static double calcArea(PolyShape[] s)
	{
		double totalArea = 0;
		
		for (int i = 0; i < s.length; i++) 
		{
			
			totalArea += s[i].area();
		}
		return totalArea;
		}
	}
