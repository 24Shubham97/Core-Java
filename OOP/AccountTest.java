package OOP;

// Test of Account getter setter method.

public class AccountTest {

	public static void main(String[] args) 
	{
		Account a = new Account();
		
		a.setNumber("xxxxxxxxxx123");
		a.setAccountType("Saving Account");
		a.setBalance(1000);
		
		System.out.println("Account Number = "+a.getNumber());
		System.out.println("Account Type = "+a.getAccountType());
		System.out.println("Account Balance = "+a.getBalance());
		
		double b  = a.getBalance();
		double dp = deposit();
		double wd = withdrawal();
		double ft = fundTransfer();
		double pb = payBill();
		
		double bc = b+dp;
		double bc1 = bc-wd;
		double bc2 = bc1-ft;
		double bc3 = bc2-pb;
		
		System.out.println("After deposit, current balance is "+bc);
		System.out.println("After withdrawal, current balance is "+bc1);
		System.out.println("After fund transfer, current balance is "+bc2);
		System.out.println("After bill payment, current balance is "+bc3);
	
		System.out.println("");
		
		System.out.println("Remaining balance"+bc3);
		
		//System.out.println("Current Account Balance = "+a.getBalance());
		//System.out.println("After deposite account balance = "+a.deposit(1000.0));
	}
	


	public static double deposit()
	{
		return 1000;
			
	}
	
	public static double withdrawal()
	{
		return 500;
	}
	
	public static double fundTransfer()
	{
		return 500;
		
	}
	
	public static double payBill()
	{
		return 300;
		
	}
}	