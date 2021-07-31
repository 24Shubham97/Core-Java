package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filewriter1
{
	public static void main(String[] args) throws Exception 
	{
		FileWriter fr = new FileWriter("D:\\abc1.txt");
		PrintWriter pw = new PrintWriter(fr);
		
		pw.println("Shubham");
		pw.println("Bairagi");
		pw.println("is");
		pw.println("a");
		pw.println("good");
		pw.println("Boy");
		
		pw.close();
		fr.close();
		System.out.println("done");
		
		
	}
}
