package OOP;

public class Icircle extends InheritShape {
	private int radius = 0;

	public Icircle() {
		System.out.println("default constructor");
	}

	public Icircle(int r) {
		radius = r;
	}

	public double area() {
		double ar = InheritShape.PI * radius * radius;
		return ar;
	}

	public int getRadius() {
		return radius;
	}

	public static void main(String[] args) {
		Icircle c = new Icircle(9);

		c.setColor("Black");
		c.setBorderWidth(6);

		double d = c.area();

		System.out.println("BorderWidth : " + c.getBorderWidth());
		System.out.println("color : " + c.getColor());
		System.out.println("Area of circle : " + d);
	}

}
