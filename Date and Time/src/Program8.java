
public class Program8 {

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[][] = new int [4][4];
		int c[][][]= new int [4][4][4];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					c[i][j][k]= i+j+k;
				}
			
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.println(" "+c[i][j][k]);
				}
				System.out.print(" ");
			}
			System.out.print(" ");
		}
	}

}
