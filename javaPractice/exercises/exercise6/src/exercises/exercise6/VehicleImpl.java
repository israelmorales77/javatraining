package exercises.exercise6;

import java.util.Scanner;

public class VehicleImpl implements VehicleActions 
{

	public Boat boat1 = new Boat();
	public Bus bus1 = new Bus();
	public String vehicle = null;
	
	public VehicleImpl() 
	{
		@SuppressWarnings("resource")
		Scanner option = new Scanner(System.in);
		
		System.out.println("Please specify which vehicle would you like to operate");  //Boat, Bus, etc.
		vehicle = option.nextLine();
		
		if(vehicle == boat1.type)
		{
			System.out.println("Let's go to the marina...");
		}
		else if(vehicle == bus1.type)
		{
			System.out.println("Let's go to the lot...");
		}
	}

	@Override
	public void start() 
	{
		if(this.vehicle == boat1.type)
		{
			boat1.start();
		}
		else if(this.vehicle == bus1.type)
		{
			bus1.start();
		}
	}

	@Override
	public void stop() 
	{
		if(this.vehicle == boat1.type)
		{
			boat1.stop();
		}
		else if(this.vehicle == bus1.type)
		{
			bus1.stop();
		}

	}

	@Override
	public void fuel() 
	{
		// TODO Auto-generated method stub
		final int GAS_PUMP = 100;
	}

	public void operate() 
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
