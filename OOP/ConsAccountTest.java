package OOP;

public class ConsAccountTest {

	public static void main(String[] args) 
	{
		ConsAccount c = new ConsAccount("xxxxxxxxxxxx142","Saving Account",1000.0);
		
		double b = c.getBalance();
		double dp = deposit();
		double wd = withdrawal();
		double ft = fundTransfer();
		double pb = paybill();
		
		double bc = b+dp;
		double bc1 = bc-wd;
		double bc2 = bc1+ ft;
		double bc3 = bc2 - pb;
		
		System.out.println("The current balance is "+b);
		System.out.println("After deposite 1000 balance is "+bc);
		System.out.println("After withdrawal current balance is "+bc1);
		System.out.println("After fund transfer current balance is "+bc2);
		System.out.println("");
		
		System.out.println("The current balance is "+bc3);
		
		
		
		
		
	}

	private static double deposit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	private static double paybill() {
		// TODO Auto-generated method stub
		return 500;
	}

	private static double fundTransfer() {
		// TODO Auto-generated method stub
		return 1000;
	}

	private static double withdrawal() {
		// TODO Auto-generated method stub
		return 200;
	}

}
