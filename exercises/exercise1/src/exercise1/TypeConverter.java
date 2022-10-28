package exercises.exercise1;

import java.util.Scanner;
import java.io.IOException;
import java.lang.Exception;
import java.util.regex.Pattern;


public class TypeConverter 
{
	
	public static Pattern garbage = null;
	
	public static IOException ioError = new IOException();
	
	protected static float setInput() throws IOException
	{
		
		TypeConverter.garbage = Pattern.compile("[a-zA-Z]");		
		
		System.out.println("Please enter something here: ");
		Scanner input1 = new Scanner(System.in);
		
		String inStream1 = input1.nextLine();
		
		if(inStream1.isEmpty() || inStream1.matches(garbage.pattern()))
		{
			System.out.println("Ooops... Try again...");			
			System.out.println(ioError.toString());
			System.exit(0);
		}
		else
		{
			System.out.println("I got you...");
			
			try
			{
				TypeConverter.value1 = Float.parseFloat(inStream1);
			}
			catch (Exception ex)
			{
				System.out.println("Ooopsie! Something went wrong...");
				ex.printStackTrace();
				System.exit(0);
			}					
			
			input1.close();
		}
		
		return TypeConverter.value1;
		
	}

	public static float getInput()
	{
		return TypeConverter.value1;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			setInput();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ooops! Something went wrong!");
		}
		finally
		{
			getInput();
			System.out.println("The value entered is: "+TypeConverter.value1);			
		}
		
		//Done with the show
		System.exit(0);
	}
	
	private static float value1 = 0.00f;

}