
public class Armstrong 
{
	public static void main(String arg[])
	{
		int  n=583,r,sum=0;
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
	
}
