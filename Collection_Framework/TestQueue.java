package Collection_Framework;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue 
{
	public static void main(String[] args) 
	{
		Queue q = new PriorityQueue<>();
		
		q.offer("Shubham");
		q.offer("Bairagi");
		q.offer("Ankit");
		q.offer("PrithviRajChouhan");
		//q.add("Shubham");
		//q.add(34.6);
		
		System.out.println(q.element());
		//System.out.println(q.remove());
		//System.out.println(q.element());
		
		System.out.println(q);
	}
}
