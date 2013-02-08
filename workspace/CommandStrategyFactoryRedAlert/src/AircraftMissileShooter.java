public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}
}
