package OOP;
import java.util.Date;
public class Person 
{
	private String name;
	private Date DOB;
	private String address;
	public static final int AVG_AGE = 70;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
