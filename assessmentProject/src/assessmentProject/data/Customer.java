package assessmentProject.data;

public class Customer 
{
	
	//Methods here
	
	public static long getCustomerID()
	{
		return customerID;
	}
	
	private static long setCustomerID()
	{
		
		return customerID;
				
	}
	
	public static String getFirstName() 
	{
		return firstName;
	}

	private static void setFirstName(String firstName) 
	{
		Customer.firstName = firstName;
	}

	public static String getLastName() 
	{
		return lastName;
	}

	private static void setLastName(String lastName) 
	{
		Customer.lastName = lastName;
	}

	public static Gender getGender() 
	{
		return gender;
	}

	private static void setGender(Gender gender) 
	{
		Customer.gender = gender;
	}

	public static boolean isNewCustomer() 
	{
		return newCustomer;
	}

	private static void setNewCustomer(boolean newCustomer) 
	{
		Customer.newCustomer = newCustomer;
	}

	public static String getPhoneNumber() 
	{
		return phoneNumber;
	}

	private static void setPhoneNumber(String phoneNumber) 
	{
		Customer.phoneNumber = phoneNumber;
	}

	//Attributes here

	private static long customerID = 0L;
	private static String firstName = null;
	private static String lastName = null;
	private static Gender gender;
	private static boolean newCustomer = false;
	private static String phoneNumber = null;
}
