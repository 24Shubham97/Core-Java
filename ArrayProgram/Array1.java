package ArrayProgram;

public class Array1 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {2,3,4,5};
		int c[] = {3,4,5,6};
		
		int p[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
 		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p[i][j] +"  ");
				
			}
			System.out.println("");
		}
	}

}
