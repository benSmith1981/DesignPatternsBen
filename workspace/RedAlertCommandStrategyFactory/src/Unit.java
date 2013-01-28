
public abstract class Unit {
	private MoveStrategy movement;
	private FireAtTargetStrategy fire;
	private TakePictureOfTargetStrategy takePicture;
//	private NoCommand nc;


	public Unit(MoveStrategy mv, FireAtTargetStrategy f, TakePictureOfTargetStrategy tp){
		movement = mv;	
		fire = f;
		takePicture = tp;
	}

//	public Unit(MoveStrategy mv, FireAtTargetStrategy f, NoCommand nc){
//		movement = mv;	
//		fire = f;
//		this.nc = nc;
//	}
	
	public void doMove(String location){
		movement.doMove(location);
	}
	
	public void fireAtTarget(Unit attacker, Unit target){
		fire.fireAtTarget(attacker,target);
	}
	
	public void takePictureOfTarget(Unit pictureTaker, Unit target){
		takePicture.takePictureOfTarget(pictureTaker,target);
	}
}
