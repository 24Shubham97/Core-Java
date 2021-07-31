package IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author shubham - Read a file line by line
 *
 */
public class Bufferedreader 
{
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("c:/name.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
	}
}
