package assessmentProject.data;

public class Order 
{

	//Methods here
	
	public static long getOrderID() 
	{
		return orderID;
	}
	public static void setOrderID(long orderID) 
	{
		Order.orderID = orderID;
	}
	public static Customer getCustomerID() 
	{
		return customerID;
	}
	public static void setCustomerID(Customer customerID) 
	{
		Order.customerID = customerID;
	}
	public static Customer getCustomerFirstName() 
	{
		return customerFirstName;
	}
	public static void setCustomerFirstName(Customer customerFirstName) 
	{
		Order.customerFirstName = customerFirstName;
	}
	public static Customer getCustomerLastName() 
	{
		return customerLastName;
	}
	public static void setCustomerLastName(Customer customerLastName) 
	{
		Order.customerLastName = customerLastName;
	}
	public static Customer getCustomerPhoneNumber() 
	{
		return customerPhoneNumber;
	}
	public static void setCustomerPhoneNumber(Customer customerPhoneNumber) 
	{
		Order.customerPhoneNumber = customerPhoneNumber;
	}
	public static Product getProductId() 
	{
		return productId;
	}
	public static void setProductId(Product productId) 
	{
		Order.productId = productId;
	}
	public static Product getProductName() 
	{
		return productName;
	}
	public static void setProductName(Product productName) 
	{
		Order.productName = productName;
	}
	public static Product getProductPrice() 
	{
		return productPrice;
	}
	public static void setProductPrice(Product productPrice) 
	{
		Order.productPrice = productPrice;
	}
	public static void setOrderDate(String orderDate)
	{
		Order.orderDate = orderDate;
	}
	public static String getOrderStatus() 
	{
		return orderStatus;
	}
	public static void setOrderStatus(String orderStatus) 
	{
		Order.orderStatus = orderStatus;
	}
	public static String getOrderDate()
	{
		return orderDate;
	}
	
	//Attributes here
		
	private static long orderID = 0L;
	private static Customer customerID = null;
	private static Customer customerFirstName = null;
	private static Customer customerLastName = null;
	private static Customer customerPhoneNumber = null;  //Up to 15 digits for intl numbers
	private static Product productId = null;
	private static Product productName = null;
	private static Product productPrice = null;
	private static String orderDate = null;    //In YYYY-MM-DD format
	private static String orderStatus = null;  //created, started, processed, shipped	
}
