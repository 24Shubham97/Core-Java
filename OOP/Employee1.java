package OOP;

public class Employee1 extends Person1 {
	private String desination;

	public Employee1() {
		System.out.println("Employee default constructor");
	}

	public Employee1(String fn, String ln, String d) {
		super(fn, ln);
		desination = d;
		System.out.println("Employee default constructor : " + fname + " " + lname + " " + desination);
	}

	public void changeAddress() {
		super.changeAddress();
		System.out.println(": Pune");
	}

	public static void main(String[] args) {
		Person1 p = new Employee1("Shubham", "Bairagi", "Software Engineer");
		p.changeAddress();
	}
}
