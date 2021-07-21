package OOP;

public class Constructor1 
{
	public Constructor1()
	{
		System.out.println("This is default constructor");
	}
	public Constructor1(int i)
	{
		System.out.println("This is parametrized constructor");
	}
	public Constructor1(int x,int y)
	{
		int z = x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		Constructor1 c = new Constructor1();
		Constructor1 c1 = new Constructor1(5);
		Constructor1 c2 = new Constructor1(5,4);
	}
}
