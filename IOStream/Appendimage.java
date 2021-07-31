package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Appendimage 
{
	public static void main(String[] args) throws Exception 
	{
		String source = "D:\\20200204_175120[1]-min-min.jpg";
		String target = "D:\\Mysignature.jpg";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read();
		
		while(ch!=-1)
		{
			writer.write(ch);
			ch=reader.read();
		}
		
		writer.close();
		reader.close();
		System.out.println("done");
	}
}
