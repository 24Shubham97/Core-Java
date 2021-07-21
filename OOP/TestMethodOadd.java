package OOP;

public class TestMethodOadd extends MethodOadd
{
	public static void main(String[] args) 
	{
		MethodOadd o =new TestMethodOadd();
		
		int a = o.add(4,5);
		int b = o.add(4,4,4);
		float c = o.add(3.5f,3.5f);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
		

	

}
