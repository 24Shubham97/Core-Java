package OOP;

public class ConsAutomobile 
{
	private String color = null;
	private int speed = 0;
	private String make = null;
	
	public ConsAutomobile(String c, String m)
	{
		color = c;
		make = m;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	/*
	 * public int break() {
	 * 
	 * speed = speed - 25;
	 * 
	 * return this.speed;
	 * 
	 * }
	 */
	public int changeGear(int a) {
		
		speed = a * 25;
		
		return this.speed;
		
	}
	public int acceleration() {
		
		speed = speed + 10; 
		
		return this.speed;
	}
	
	public int breaak()
	{
		speed = speed - 20;
		return this.speed;
	}
}
