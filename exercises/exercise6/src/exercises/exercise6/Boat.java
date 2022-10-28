package exercises.exercise6;

public class Boat extends Vehicle implements VehicleActions {

	public Boat()
	{
		super.type = "Boat";
		super.isMoving = false;
		insure();
		register();
		System.out.println("Let's sail...");
	}
	
	@Override
	public void start() {
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
