package OOP;

public class ConsAccount 
{
	private String number = null;
	private String accountType= null;
	private double balance = 1000.00;
	
	public String getNumber() {
		return number;
	}
	
	public ConsAccount() 
	{
		System.out.println("This is default constructor");
	}
	public ConsAccount(String n,String a, double b)
	{
		number = n;
		accountType = a;
		balance = b;
	}
	

	/*
	 * public void setNumber(String number) { this.number = number; }
	 */
	public String getAccountType() {
		return accountType;
	}

	/*
	 * public void setAccountType(String accountType) { this.accountType =
	 * accountType; }
	 */
	public double getBalance() {
		return balance;
	}
	/*
	 * public void setBalance(double balance) { this.balance = balance; }
	 */

	

}
