package assessmentProject.data;

public class Customer 
{
	
	//Methods here
	
	public static long getCustomerID()
	{
		return customerID;
	}
	
	public static long setCustomerID()
	{
		
		return customerID;
				
	}
	
	public static String getFirstName() 
	{
		return firstName;
	}

	public static void setFirstName(String firstName) 
	{
		Customer.firstName = firstName;
	}

	public static String getLastName() 
	{
		return lastName;
	}

	public static void setLastName(String lastName) 
	{
		Customer.lastName = lastName;
	}

	public static boolean isNewCustomer() 
	{
		return newCustomer;
	}

	public static void setNewCustomer(boolean newCustomer) 
	{
		Customer.newCustomer = newCustomer;
	}

	public static String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public static void setPhoneNumber(String phoneNumber) 
	{
		Customer.phoneNumber = phoneNumber;
	}

	//Attributes here

	private static long customerID = 0L;
	private static String firstName = null;
	private static String lastName = null;	
	private static boolean newCustomer = false;
	private static String phoneNumber = null;
}
