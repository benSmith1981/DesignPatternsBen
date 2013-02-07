public class Aircraft extends Unit{
	private TakePictureOfTargetStrategy takePicture;

	public Aircraft(MoveStrategy mv, FireAtTargetStrategy f, TakePictureOfTargetStrategy tp){
		super(new Fly(), new DropBomb());
		takePicture = tp;
	}
	
	public void takePictureOfTarget(Unit pictureTaker, Unit target){
		takePicture.takePictureOfTarget(pictureTaker,target);
	}
}
