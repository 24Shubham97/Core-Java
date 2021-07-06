package ArrayProgram;

public class Array2 {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		
		int p[][] = {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(" "+p[i][j]);
			}
			System.out.println(" ");
		
		}
		
	}

}
