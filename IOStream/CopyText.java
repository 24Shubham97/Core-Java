package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyText 
{
	public static void main(String[] args) throws Exception 
	{
		String source = "D:\\abc1.txt";
		String target = "D:\\abc2.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read();
		while(ch!=-1)
		{
			writer.write(ch);
			ch = reader.read();
		}
		
		writer.close();
		reader.close();
		
		System.out.println("done");
	
	}
}