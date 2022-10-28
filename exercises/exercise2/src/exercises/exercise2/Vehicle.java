package exercises.exercise2;

public abstract class Vehicle implements VehicleActions 
{
	
	
	public void start() 
	{
				
	}
	public void stop() 
	{
	
	}
	public void fuel() 
	{
	
	}
	public void operate() 
	{
	
	}
	
	protected static String type = null;  //Truck, Car, Boat, Motorcycle, Bus, etc...
	protected static boolean isStarted = false;
	protected static boolean keyInIgnition = false;
	protected static boolean isTankFull = true;	
	
}
