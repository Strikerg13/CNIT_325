package cnit325_lab06;

public class Graduate extends Student
{
	private String major;
	private boolean thesis; // yes or no
	private int focus; // 0 = neither  1 = MS  2 = PhD
	
	// Constructors
	public Graduate(String firstName, 
			   char middleInitial, 
			   String lastName, 
			   String PUID, 
			   String Address, 
			   String State, 
			   String zipCode, 
			   String country, 
			   String major, 
			   boolean thesis, 
			   int focus)
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
		this.thesis = thesis;
		this.focus = focus;
	}
	
	public Graduate()
	{
		super();
		this.major = "";
		this.thesis = false;
		this.focus = 0;
	}
	
	// Getters
	public String getMajor()
	{
		return major;
	}
	
	public boolean getThesis()
	{
		return thesis;
	}
	
	public int getFocus()
	{
		return focus;
	}
	
}
