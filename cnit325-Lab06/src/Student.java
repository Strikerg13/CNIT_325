

public abstract class Student 
{
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String PUID;
	private String Address;
	private String State;
	private String zipCode;
	private String country;
	
	// Constructors
	public Student(String firstName, 
				   char middleInitial, 
				   String lastName, 
				   String PUID, 
				   String Address, 
				   String State, 
				   String zipCode, 
				   String country)
	{
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.PUID = PUID;
		this.Address = Address;
		this.State = State;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	public Student()
	{
		firstName = "";
		middleInitial = ' ';
		lastName = "";
		PUID = "";
		Address = "";
		State = "";
		zipCode = "";
		country = "";
	}
	
	// Setters
	public void setStudent(String firstName, 
			   char middleInitial, 
			   String lastName, 
			   String PUID, 
			   String Address, 
			   String State, 
			   String zipCode, 
			   String country)
	{
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.PUID = PUID;
		this.Address = Address;
		this.State = State;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	// Getters
	public String getFirstName()
	{
		return firstName;
	}
	
	public char getMiddleInitial()
	{
		return middleInitial;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPUID()
	{
		return PUID;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public String getState()
	{
		return State;
	}
	
	public String getZipCode()
	{
		return zipCode;
	}
	
	public String getCountry()
	{
		return country;
	}
}
