package exercises.exercise3;

public class MethodOverloading {

	

	protected static double setNumbers(double num1, double num2, double num3)
	{
		double workVar = 0.00D;
		try
		{
			System.out.println("Adding Up...");
			workVar = num1 + num2 + num3;
		}
		catch(Exception ex)
		{
			System.out.println("Oooops...");
			ex.printStackTrace();
			System.exit(-1);
		}
		finally
		{
			System.out.println("Done!");
			MethodOverloading.sumOfFloats = workVar;
		}
		
		return MethodOverloading.sumOfFloats;
	}
	
	protected static double setNumbers(double d, double e, double f, double g)
	{
		double workVar = 0.00f;
		try
		{
			System.out.println("Adding Up...");
			workVar = d + e + f + g;
		}
		catch(Exception ex)
		{
			System.out.println("Oooops!");
			ex.printStackTrace();
			System.exit(-1);
		}
		finally
		{
			System.out.println("Done!");
			MethodOverloading.anotherSumOfFloats = workVar;
		}
		
		return MethodOverloading.anotherSumOfFloats;
	}
	
	public static void main(String[] args) 
	{
		
		setNumbers(5.4D, 2.3D, 1.5D);
		setNumbers(6.0D, 10.9D, 100.3D, 1005.4D);
		
		System.out.println("The first sum value is: " + sumOfFloats);
		System.out.println("The second sum value is: " + anotherSumOfFloats);
		System.exit(0);

	}
	
	private static double sumOfFloats = 0.00D;
	
	private static double anotherSumOfFloats = 0.00D;

}
