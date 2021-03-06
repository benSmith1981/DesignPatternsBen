public class AircraftTakePictureCommand implements UnitCommand{
	private Aircraft pictureTaker;
	private Unit target;

	public AircraftTakePictureCommand(Aircraft pictureTaker, Unit target)
	{
		this.target = target;
		this.pictureTaker = pictureTaker;
	}
	
	@Override
	public void executeCommand(){
		pictureTaker.takePictureOfTarget(pictureTaker, target);			
	}
}
