package OOP;

public class Person1 
{
	protected String fname = null;
	protected String lname = null;
	protected String address = null;
	
	public Person1() {
	
		System.out.println("Person Default Constructor");
	}
	public Person1(String fn, String ln) 
	{
		fname = fn;
		lname = ln;
		System.out.println("2 parameter Constructor : "+fname+" "+lname);
	}
	public Person1(String fn, String ln,String address) 
	{
		this(fn,ln);
		this.address = address;
		System.out.println("3 parameter Constructor : "+fname+" "+lname+" "+address);
	}
	
	public void changeAddress()
	{
		System.out.print("Person change Address");
	}
	
	public static void main(String[] args) 
	{
		Person1 p = new Person1("Shubham","Bairagi","Indore");
	}
}
