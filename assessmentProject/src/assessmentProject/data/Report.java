package assessmentProject.data;

public class Report 
{
	
	//Methods here
	
	public static long getReportID() 
	{
		return reportID;
	}
	public static void setReportID(long reportID) 
	{
		Report.reportID = reportID;
	}
	public static Customer getCustomerID() 
	{
		return customerID;
	}
	public static void setCustomerID(Customer customerID) 
	{
		Report.customerID = customerID;
	}
	public static Order getOrderID() 
	{
		return orderID;
	}
	public static void setOrderID(Order orderID) 
	{
		Report.orderID = orderID;
	}
	public static Order getOrderDate() 
	{
		return orderDate;
	}
	public static void setOrderDate(Order orderDate) 
	{
		Report.orderDate = orderDate;
	}
	public static Order getOrderStatus() 
	{
		return orderStatus;
	}
	public static void setOrderStatus(Order orderStatus) 
	{
		Report.orderStatus = orderStatus;
	}
	public static String getReportDate() 
	{
		return reportDate;
	}
	public static void setReportDate(String reportDate) 
	{
		Report.reportDate = reportDate;
	}
	
	//Attributes here
		
	private static long reportID = 0L;
	private static Customer customerID = null;
	private static Order orderID = null;
	private static Order orderDate = null;
	private static Order orderStatus = null;
	private static String reportDate = null;
	
}
