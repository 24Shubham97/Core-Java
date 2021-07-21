package OOP;

public abstract class AShape 
{
	private String color = null; // class has to be abstract.
	private int borderWidth = 0;
	public static final double PIE = 3.14;
	
	public abstract double area();  // It is abstract method by using abstract keyword.

		
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
}}
