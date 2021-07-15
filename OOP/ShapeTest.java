package OOP;
public class ShapeTest {

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		
		s.setColor("Red");
		s.setBorderWidth(6);
		
		
		
		System.out.println("color ="+s.getColor());
		System.out.println("Border ="+s.getBorderWidth());

	}

}
