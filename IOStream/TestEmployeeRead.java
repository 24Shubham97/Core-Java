package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestEmployeeRead 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream file = new FileInputStream("D:\\object.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee)(in.readObject());
		
		System.out.println("Id : "+e.getId());
		System.out.println("First Name : "+e.getFirstName());
		System.out.println("Last Name : "+e.getLastName());
		System.out.println("Adress Name : "+e.getAddress());
		System.out.println("Salary : "+e.getSalary());
		
	}
}
