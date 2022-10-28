package exercises.exercise9;

import java.util.LinkedList;

public class LinkedListExercise 
{

	static LinkedList<String> cars = new LinkedList<String>();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
	    
		cars.add("Volvo");
		cars.add("Audi");
	    cars.add("BMW");
	    cars.add("Mini");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    cars.removeFirst();
	    cars.removeLast();
	    
	    for(String car: cars)
	    {
	    	System.out.println(car);
	    }
	    
	}

}
