package IOStream;

import java.io.File;
import java.security.PublicKey;
import java.util.Date;

public class FileFirst 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\shubham\\Desktop\\html");
		
		
		
		if(f.exists())
		{
			System.out.println("Name = "+f.getName());
			System.out.println("Absolute Path = "+f.getAbsolutePath());
			System.out.println("Is writable = "+f.canWrite());
			System.out.println("Is readable = "+f.canRead());
			System.out.println("Is file : "+f.isFile());
			System.out.println("Is Directory = "+f.isDirectory());
			System.out.println("Last Modified = "+new Date(f.lastModified()));
			System.out.println("Length : "+f.length());
			
		}
		
	}
}
