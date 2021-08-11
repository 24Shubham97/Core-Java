package Java8;
@FunctionalInterface
public interface HelloInt {

	//public void show();
	//public int math(int a,int b);
	public String concate(String  a,String b);
	
	public static void table() {
		System.out.println("Table method callled");
	}
	
	default void count()
	{
		System.out.println("Count method called");
	}
}
