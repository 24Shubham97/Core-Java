
public class Reverse {

	public static void main(String[] args) 
	{
		int num=155,reverse,sum=0;
		while(num>0)
		{
			reverse=num%10;
			num=num/10;
			sum=sum*10+reverse;
		}
		System.out.println(sum);

	}

}
