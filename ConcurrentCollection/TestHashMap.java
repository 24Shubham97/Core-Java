package ConcurrentCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap extends Thread {
	
		private static ConcurrentHashMap chm = new ConcurrentHashMap();
		
		@Override
		public void run() {
			chm.put("five", 5);
		
		}
		
		public static  void main(String[] args) {
			
			chm.put("one", 1);
			chm.put("two", 2);
			chm.put("three", 3);
			chm.put("four", 4);
			TestHashMap t1 = new TestHashMap();
			t1.start();
			
			for (Object o : chm.entrySet()) {
				System.out.println(o);
			}
			System.out.println(chm);
			
		}
}
