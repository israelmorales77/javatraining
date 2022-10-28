package exercises.exercise7;

import java.lang.String;

public class ArrayPractice 
{
	public static String[] fruits = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		fruits = new String[10];
		
		fruits[0] = "coconut";
		fruits[1] = "apple";
		fruits[2] = "banana";
		fruits[3] = "orange";
		fruits[4] = "pineapple";
		fruits[5] = "grape";
		fruits[6] = "blueberry";
		fruits[7] = "kiwi";
		fruits[8] = "dragonfruit";
		fruits[9] = "strawberry";
		
		for(String fruit : fruits)
		{
			System.out.println(fruit.toString());
		}
		
		System.exit(0);
		
	}
	
}
