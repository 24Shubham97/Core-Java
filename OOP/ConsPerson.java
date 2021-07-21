package OOP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsPerson 
{
	private  String fname = null;
	private String lname = null;
	private Date dob;
	private String address = null;
	public static final int AVG_AGE=70;
	
	/*
	 * public void setName(String name) { this.name = name; }
	 */
	ConsPerson()
	{
		System.out.println("this is default constructor");
	}
	ConsPerson(String a,String b)
	{
		fname = a;
		lname = b;
		
	}
	
	ConsPerson(String a,String b,String e) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(e);
		dob = d1;
		fname = a;
		lname = b;
		
		
	}
	
	public Date getDob() 
	{
		return dob;
	}

	/*
	 * public void setDob(Date dob) { this.dob = dob; }
	 */
	public String getAddress()
	{
		return address;
	}
	/*
	 * public void setAddress(String address) { this.address = address; }
	 */
	ConsPerson(String a,String b,String c, String d) throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(c);
		dob = d1;
		fname = a;
		lname = b;
		address = d;
	}
	}
	

