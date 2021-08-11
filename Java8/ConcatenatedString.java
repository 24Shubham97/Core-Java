package Java8;

public class ConcatenatedString 
{
	public static void main(String[] args) {
		
		HelloInt h = (a,b) -> {
			return a.concat(" "+b);
		};
		
		String c = h.concate("Shubham", "Bairagi");
		System.out.println(c);
		
		
		HelloInt.table();
		h.count();
	}
}
