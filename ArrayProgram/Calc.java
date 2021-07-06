package ArrayProgram;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) 
	{
		int a=0,b=0;
		char operator;
		double result=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("What Operation?");
		operator = sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			result = a+b;
			
		case '-':
			result = a-b;
			
		case '*':
			result = a*b;
		case '/':
			result = a/b;
			
		}
		System.out.println("final result");
		System.out.println(result);

	}

}
