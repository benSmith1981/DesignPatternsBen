
public class UnitTakePictureCommand implements UnitCommand{
	private Unit pictureTaker;
	private Unit target;

	public UnitTakePictureCommand(Unit pictureTaker, Unit target)
	{
		this.target = target;
		this.pictureTaker = pictureTaker;
	}
	
	@Override
	public void executeCommand(){
		pictureTaker.takePictureOfTarget(pictureTaker, target);			
	}
}
