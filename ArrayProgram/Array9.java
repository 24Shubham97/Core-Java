package ArrayProgram;

public class Array9 {

	public static void main(String[] args) 
	{
		int a[] = new int[4];
		//int a[][]= new int[3][3];
		//int a[][][] = new int [3][3][3];
		
		for(int i=0;i<a.length;i++)
		{
			//for(int j=0;j<a.length;j++)
			//{
				//for(int k=0;j<a.length;j++)
				//{
				a[i] = 0+i;	
				//}
			//}
		}
		for(int i : a)
		{
			//for(int j : i)
			//{
				//for(int k : j)
				//{
			System.out.print(i+ " ");
				//}
				//System.out.println("");
		}
			System.out.print(" ");
		}
	}


