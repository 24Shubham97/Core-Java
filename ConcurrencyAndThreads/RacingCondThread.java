package ConcurrencyAndThreads;

public class RacingCondThread extends Thread
{
	public static Account data = new Account();
	
	String name = null;
	
	public RacingCondThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				data.deposit(name,1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.run();
	}
	
	public static void main(String[] args) {
		RacingCondThread t1 = new RacingCondThread("Bairagi");
		RacingCondThread t2 = new RacingCondThread("Bharthare");
		
		t1.start();
		t2.start();
	}
}
