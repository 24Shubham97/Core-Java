package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class CFExcercise5 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		for (int p = 0; p < 100000; p++) {
			a.add(p);
		}
		//System.out.println(a);
	

	Random r = new Random();
	for(int i = 0;i<=50;i++)
	{
		int p = r.nextInt(5000);
		System.out.println(a.get(p));
		//System.out.println(p);

	}
	HashSet sh = new HashSet<>(a);

}}
