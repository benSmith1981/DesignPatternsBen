
public class TakePicture implements TakePictureOfTargetStrategy{
	
@Override
	public void takePictureOfTarget(Unit pictureTaker, Unit target)
	{
		System.out.println(pictureTaker.getClass().getName() + " takes picture of " + target.getClass().getName());
	}
}
