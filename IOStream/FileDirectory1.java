package IOStream;

import java.io.File;

public class FileDirectory1 
{
	public static void main(String[] args) 
	{
		File directory = new File("C:\\Users\\shubham\\Desktop\\Core-Java\\Date and Time");
		
		String[] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			File f = new File("C:\\Users\\shubham\\Desktop\\Core-Java\\Date and Time",list[i]);
			if(f.isFile()) {
			System.out.println(i+1 +" : "+list[i]);
			}
		}
	}
}
