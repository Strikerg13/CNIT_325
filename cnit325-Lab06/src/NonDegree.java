

public class NonDegree extends Student
{
	private String college;
	
	public NonDegree(String firstName, 
			   char middleInitial, 
			   String lastName, 
			   String PUID, 
			   String Address, 
			   String State, 
			   String zipCode, 
			   String country, 
			   String college)
	{
		super(firstName, 
			  middleInitial, 
			  lastName, 
			  PUID, 
			  Address, 
			  State, 
			  zipCode, 
			  country);
		
		this.college = college;
	}
	
	public NonDegree()
	{
		super();
		this.college = "";
	}
	
	// Getters
	public String getCollege()
	{
		return college;
	}
}
