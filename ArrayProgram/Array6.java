package ArrayProgram;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		int a[] = new int[4];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = r.nextInt(9);
			System.out.print(a[i]);
		}
		try
		{
		System.out.println(a[24]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nThe maximum number is 4");
		}
	}

}
