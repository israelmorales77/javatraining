package exercises.exercise8;

import java.util.ArrayList;

public class ArrayListExercise 
{
	
	public static ArrayList<String> carBrandsList = new ArrayList<String>();
	
	protected static ArrayList<String> addCarBrands()
	{
		String [] brandList = {"Acura","Lexus","Infinity","Aston Martin","Bentley","Ferrari","Lamborghini","Masseratti","MacLaren","Lotus"};
		
		try
		{
			for(String brand : brandList)
			{
				ArrayListExercise.carBrandsList.add(brand);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Ooooops!");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("All car brands registered");
		}
		
		return carBrandsList;		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addCarBrands();
		
		for(String carBrand : carBrandsList)
		{
			System.out.println("A car brand is: ".concat(carBrand));
		}

	}

}
