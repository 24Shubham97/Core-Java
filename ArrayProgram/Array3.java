package ArrayProgram;

public class Array3 
{
	public static void main(String arg[])
	{
		int a[][] = new int[10][9];
		
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("table is= "+ a[i][j]);
			}
			System.out.println("");
		}
	}
}
