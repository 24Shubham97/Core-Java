package ConcurrencyAndThreads;

/**
 * @author shubham program of Account with the Synchronisation.
 *
 */
public class Account 
{
	private int balance = 0;
	
	public synchronized void deposit(String message,int amount) throws InterruptedException {
		int bal = getBalance();
		setBalance(balance + amount);
		System.out.println(message + "= Now balance :"+getBalance());
		
		
	}

	public int getBalance() throws InterruptedException {
		Thread.sleep(200);
		return balance;
	}

	public void setBalance(int balance) throws InterruptedException {
		Thread.sleep(200);
		this.balance = balance;
	}
	
}
