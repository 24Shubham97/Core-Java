package OOP;

public class PolyShape 
{
	private String color = null;
	private int borderWidth = 0;
	public static final double PIE = 3.14;
	
	public PolyShape() {}
	
	public double area() {
		return 0.0;
	}

		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
}

