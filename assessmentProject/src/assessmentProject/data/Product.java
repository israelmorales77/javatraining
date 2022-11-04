package assessmentProject.data;

public class Product 
{
	
	//Methods here
	
	public static long getProductID() 
	{
		return productID;
	}
	public static void setProductID(long productID) 
	{
		Product.productID = productID;
	}
	public static long getSkuID() 
	{
		return skuID;
	}
	public static void setSkuID(long skuID) 
	{
		Product.skuID = skuID;
	}
	public static long getBarcode() 
	{
		return barcode;
	}
	public static void setBarcode(long barcode) 
	{
		Product.barcode = barcode;
	}
	public static String getProductName() 
	{
		return productName;
	}
	public static void setProductName(String productName) 
	{
		Product.productName = productName;
	}
	public static long getStockCount() 
	{
		return stockCount;
	}
	public static void setStockCount(long stockCount) 
	{
		Product.stockCount = stockCount;
	}
	public static double getPrice() 
	{
		return price;
	}
	public static void setPrice(double price) 
	{
		Product.price = price;
	}
	
	public static boolean isInStock() 
	{
		return isInStock;
	}
	public static void setInStock(boolean isInStock) 
	{
		Product.isInStock = isInStock;
	}
	
	//Attributes here
	
	private static long productID = 0L;
	private static long skuID = 0L;
	private static long barcode = 0L;
	private static String productName = null;
	private static long stockCount = 0L;
	private static double price = 0.00D;
	private static boolean isInStock = false;
}