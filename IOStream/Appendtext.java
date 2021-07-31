package IOStream;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shubham PRogram for Append Text/Bytes in existing File
 *
 */
public class Appendtext 
{
	public static void main(String[] args) throws Exception {
		//FileWriter fw = new FileWriter("D:\\abc1.txt",true);
		FileWriter fw1 = new FileWriter(new File("D:\\abc1.txt"),true);
		
		PrintWriter pw = new PrintWriter(fw1);
		
		pw.println("Shubham");
		pw.println("Bhaiya");
		
		for (int i = 0; i < 5; i++) {
			pw.println("hello"+i);
		}
		
		pw.close();
		fw1.close();
		System.out.println("done");
	}
}
