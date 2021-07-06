
public class Program7 {

	public static void main(String[] args)
	{
		int a[] = {1,3,5,7};
		int b[] = {2,4,6,8};
		//int c[] = {1,2,3,4};
		
		int p[][] = {
					{1,3,5,7},{2,4,6,8}
				
				};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p[i][j] +" ");
			}
			System.out.println(" ");
		}
	}

}
