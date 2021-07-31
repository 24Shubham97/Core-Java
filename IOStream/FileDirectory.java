package IOStream;

import java.io.File;

/**
 * @author shubham
 * Program for read the directory.
 */
public class FileDirectory 
{
	public static void main(String[] args) {
		File directory = new File("F:\\");
		String list[] = directory.list();
				
		for (int i = 0; i < list.length; i++) {
			
			System.out.println(i +" :"+list[i]);
		}
				
	}
}
