class Array4
{
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7};
		int c[]= {7,8,9,10};
		
		int p[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p[i][j] + "  ");
			}
		 System.out.println("");		
		}
		
	}
}