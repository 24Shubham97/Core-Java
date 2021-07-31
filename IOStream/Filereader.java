package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shubham	Read char from a file
 */  
 
public class Filereader 
{
	public static void main(String[] args) throws Exception 
	{
		FileReader reader = new FileReader("C:/name.txt");
		int ch = reader.read();
		char chr;
		
		while(ch!=-1)
		{
			chr = (char)ch;
			System.out.println(chr);
			ch=reader.read();
		}
	}
}
