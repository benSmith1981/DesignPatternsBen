
public class AircraftMissileShooter extends Unit {

	public AircraftMissileShooter(){
		super(new Fly(), new FireMissile(),  new TakePicture());
	}	
}
