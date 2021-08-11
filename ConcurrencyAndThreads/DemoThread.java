package ConcurrencyAndThreads;


//public class DemoThread extends Thread
public class DemoThread implements Runnable
{
		
		private String name = null;
		
		public DemoThread(String name) {
			this.name=name;
		}
		
		@Override
		public void run() {
		
			for (int i = 0; i < 50; i++) {
				System.out.println(i+" "+name);
			}
			
		}
		
		
	}

