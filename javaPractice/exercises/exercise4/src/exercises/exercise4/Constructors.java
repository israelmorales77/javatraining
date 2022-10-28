package exercises.exercise4;

public class Constructors {

	public Constructors() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("This is a default constructor...");
	}
	
	public Constructors(int value1, String value2, char value3)
	{
		Constructors.someValue1 = value1;
		Constructors.someValue2 = value2;
		Constructors.someValue3 = value3;
	}

	public static void main(String[] args) {
		new Constructors();
		
		System.out.println("The values of someValue1, someValue2 and someValue3 from object1 are: " + Constructors.someValue1 + Constructors.someValue2+ Constructors.someValue3);
		
		new Constructors(10, "Hello", 'a');
		
		System.out.println("The values of someValue1, someValue2 and someValue3 from object2 are: " + Constructors.someValue1 + Constructors.someValue2+ Constructors.someValue3);
		
		System.exit(0);
	}
	
	private static int someValue1 = 0;
	private static String someValue2 = null;
	private static char someValue3 = '\0';

}