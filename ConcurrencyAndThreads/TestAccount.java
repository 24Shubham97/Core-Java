package ConcurrencyAndThreads;

public class TestAccount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		DemoThread d1 = new DemoThread("Bairagi");

		DemoThread d2 = new DemoThread("Bharthare");
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t1.sleep(1000);
		
		t2.start();
		t2.sleep(1000);
	}
}
