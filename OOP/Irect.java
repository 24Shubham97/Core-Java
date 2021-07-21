package OOP;

public class Irect extends InheritShape
{
	private int length = 0;
	private int width = 0;
	
	public int area()
	{
		int ar = length*width;
		return ar;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public static void main(String[] args) 
	{
		Irect r = new Irect();
		
		r.setColor("Skyblue");
		r.setBorderWidth(9);
		r.setLength(5);
		r.setWidth(6);
		
		int area = r.area();
		System.out.println("Area of rectangel : "+area);
		System.out.println("color : "+r.getColor());
		System.out.println("BorderWidth : "+r.getBorderWidth());
	}
	
}
	