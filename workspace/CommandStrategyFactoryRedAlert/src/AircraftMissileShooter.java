/**
 * This is concrete AircraftMissileShooter Product that extends Aircraft and implements the Abstract Aircraft methods
 * @author ben
 *
 */
public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(){
		super(new Fly(), new FireMissile(), new TakePicture());
	}
	
}
