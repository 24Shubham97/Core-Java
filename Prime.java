
public class Prime {

	public static void main(String[] args) 
	{
		int num=15;
		boolean isPrime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				
			}
			
			
		}
		if(isPrime)
		{
			System.out.println("Prime Number")	;	
		}else
		{
			System.out.println("Not Prime Number");
		}
		
	}

}
