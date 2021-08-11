package Java8;

public class TestMaths 
{
	public static void main(String[] args) {
		HelloInt h = (a,b) ->  
			
				{
					return a/b;
				};
				int c = h.math(10, 10);
				System.out.println("Addtion : "+c);
	}
}
