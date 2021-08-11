package Java8;

/**
 * @author shubham program for Anonymous classes.
 *
 */
public class TestInterface {
	public static void main(String[] args) 
	{
		HelloInt h = new HelloInt() {
			
			@Override
			public void show() {
				System.out.println("Anonymous classes called");
				
			}
		
		};
		h.show();
	}
}
