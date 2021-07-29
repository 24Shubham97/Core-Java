package Collection_Framework;

public class Marksheet implements Comparable<Marksheet>
{
	private String rollNo;
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private int physics;
	private int chemistry;
	private int maths;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}
	public boolean equals(Object o)
	{
		if(o==null) return false;
		if(!(o instanceof Marksheet)) return false;
		Marksheet other = (Marksheet) o;
		return this.getRollNo().equals(other.getRollNo());
	}
	public int hashCode()
	{
		return rollNo.hashCode();
	}
	@Override
	public int compareTo(Marksheet o) {
		
		return this.getRollNo().compareTo(o.getRollNo());
	}
}