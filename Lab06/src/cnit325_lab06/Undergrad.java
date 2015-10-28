package cnit325_lab06;

public class Undergrad extends Student 
{
	private String major;
	
	public Undergrad(String firstName, 
			   char middleInitial, 
			   String lastName, 
			   String PUID, 
			   String Address, 
			   String State, 
			   String zipCode, 
			   String country, 
			   String major)
	{
		super(firstName, 
			  middleInitial, 
			  lastName, 
			  PUID, 
			  Address, 
			  State, 
			  zipCode, 
			  country);
		
		this.major = major;
	}
	
	public Undergrad()
	{
		super();
		this.major = "";
	}
	
	public String getMajor()
	{
		return major;
	}
	
	
}
