package ArrayProgram;

public class Array7 {

	public static void main(String[] args) 
	{
		int a[][] = new int[4][4];
		
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 7;
		a[0][3] = 4;
		a[0][0] = 5;
		a[1][0] = 11;
		a[1][1] = 14;
		a[1][2] = 17;
		a[1][3] = 19;
		a[2][1] = 51;
		a[2][2] = 64;
		a[2][3] = 72;
		a[3][1] = 297;
		a[3][2] = 103;
		a[3][3] = 79;
		a[3][3] = 91;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				j= j+1;
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println(" ");
		}
	}

}
