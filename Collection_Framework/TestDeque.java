package Collection_Framework;

import java.util.Deque;
import java.util.LinkedList;


public class TestDeque 
{
	public static void main(String[] args) 
	{
		Deque d = new LinkedList<>();
		
		d.addFirst("Shubham");
		d.addLast("Bairagi");
		
		d.addFirst("Neeraj");
		System.out.println(d);
		
		System.out.println(d.poll());
		System.out.println(d.peek());
	}
}
