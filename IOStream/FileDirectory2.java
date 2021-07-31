package IOStream;

import java.io.File;

public class FileDirectory2 
{
	public static void main(String[] args) 
	{
		File directory = new File("D:\\");
		File list[] = directory.listFiles(); // listFiles() : Display only files from a folder
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile())
			{
				System.out.println(list[i].getName());
			}
		}
	}
}
