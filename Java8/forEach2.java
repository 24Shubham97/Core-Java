package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class forEach2 
{
	/**
	 * @param args program for foreach method and there cases.
	 */
	public static void main(String[] args) {
		List<String> items = Arrays.asList("One","Two","Three","Four","Five");
		
		Stream<String> stream = items.stream();
		
		/*  forEach method used for print all the elements.
		 * stream.forEach(e -> { System.out.println(e); });
		 */
		
		/* for used for sort all the elemetns
		 * items.stream().sorted().forEach(e -> { System.out.println(e); });
		 */
		
		/* for used print all the element into uppercase
		 * items.stream().map(e -> e.toUpperCase()).forEach(e -> {
		 * System.out.println(e); });
		 */
		

		
		/* for used filter the given element by using filter method.
		 * items.stream().filter(e -> e.startsWith("F")).map(e ->
		 * e.toUpperCase()).forEach(e -> { System.out.println(e); });
		 */
		
		
		 
		  items.stream().filter(e -> e.startsWith("O")).distinct().map(e ->
		  e.toUpperCase()).forEach(e -> { System.out.println(e); });
		 
		
		
	}
}
