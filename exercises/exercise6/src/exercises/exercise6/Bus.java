package exercises.exercise6;

public class Bus extends Vehicle implements VehicleActions 
{

	public Bus()
	{
		super.type = "Bus";
		insure();
		register();
		super.isMoving = false;
		System.out.println("Let's drive...");
	}
	
	@Override
	public void start() 
	{
		// TODO Auto-generated method stub
		super.keyInIgnition = true;		
		super.isStarted = true;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.keyInIgnition = true;
		super.isMoving = false;
		super.isStarted = false;
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		while(this.isMoving = true)
		{
			this.gasTank--;
		}
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub		
		this.isMoving = true;
		fuel();
	}

	@Override
	void insure() {
		// TODO Auto-generated method stub
		this.isInsured = true;
	}

	@Override
	void register() {
		// TODO Auto-generated method stub
		this.isLicensed = true;
	}

}
