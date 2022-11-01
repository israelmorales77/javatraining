package exercises.exercise11;

public class TryCatchFinallyExercise 
{
	public static String phrase = "Yada, yada, yada";
	public static int number = Integer.parseInt("20");
	public static int anotherNumber = 0;
	
	public static void main(String[] args) 
	{				
		// TODO Auto-generated method stub
		try
		{
			int modNumber = number % anotherNumber;
			phrase.concat(Integer.toString(number));
			System.out.println(phrase);
			System.out.println(Integer.toString(modNumber));
			System.out.println("The value of another number is: " + anotherNumber);
						
		}
		catch(Exception ex)
		{
			System.out.println("Oooops!");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("The value of phrase is: " + phrase);
			System.out.println("Nothing else...");
		}
	}

}
