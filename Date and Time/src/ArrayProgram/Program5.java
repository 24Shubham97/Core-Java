package ArrayProgram;

public class Program5 {

	public static void main(String[] args) 
	{
		int a[] = new int[14];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = i+1;
			//System.out.print(" "+a[i]);
		}
		for(int i : a)
		{
			
			System.out.print(" "+i);
		}
	}

}
