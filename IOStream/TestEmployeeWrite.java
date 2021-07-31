package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeWrite 
{
	public static void main(String[] args) throws Exception 
	{
		
		FileOutputStream file = new FileOutputStream("D:\\object.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.setFirstName("Shubham");
		e.setLastName("Bairagi");
		e.setId(01);
		e.setAddress("Indore");
		e.setSalary(100000);
		
		
		out.writeObject(e);
		
		out.close();
		
		System.out.println("done");
		
	}
}
