package assessmentProject.data;

public class Product 
{
	
	//Methods here
	
	public static long getProductID() 
	{
		return productID;
	}
	private static void setProductID(long productID) 
	{
		Product.productID = productID;
	}
	public static long getSkuID() 
	{
		return skuID;
	}
	private static void setSkuID(long skuID) 
	{
		Product.skuID = skuID;
	}
	public static long getBarcode() 
	{
		return barcode;
	}
	private static void setBarcode(long barcode) 
	{
		Product.barcode = barcode;
	}
	public static String getProductName() 
	{
		return productName;
	}
	private static void setProductName(String productName) 
	{
		Product.productName = productName;
	}
	public static long getStockCount() 
	{
		return stockCount;
	}
	private static void setStockCount(long stockCount) 
	{
		Product.stockCount = stockCount;
	}
	public static double getPrice() 
	{
		return price;
	}
	private static void setPrice(double price) 
	{
		Product.price = price;
	}
	
	//Attributes here
	
	private static long productID = 0L;
	private static long skuID = 0L;
	private static long barcode = 0L;
	private static String productName = null;
	private static long stockCount = 0L;
	private static double price = 0.00D;
}