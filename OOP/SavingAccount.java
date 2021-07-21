package OOP;


public class SavingAccount extends Account1
	{
		public int getAmount()
		{
			int i = super.getAmount()  + 10;
			return i;
		}
		
		public static void main(String[] args) 
		{
			Account1 a = new SavingAccount();
			System.out.println(a.getAmount());
					}
	}

