package exercises.exercise6;

public abstract class Vehicle implements VehicleActions 
{
	
	abstract void insure();
	abstract void register();
	abstract void operate();
		
	public void start() 
	{
				
	}
	public void stop() 
	{
	
	}
	public void fuel() 
	{
	
	} 
		
	protected String type = null;  //Truck, Car, Boat, Motorcycle, Bus, etc...
	protected boolean isStarted = false;
	protected boolean isMoving = false;
	protected boolean keyInIgnition = false;
	protected boolean isTankFull = true;
	protected boolean isInsured = false;
	protected boolean isLicensed = false;
	protected int gasTank = 100;
	
}
