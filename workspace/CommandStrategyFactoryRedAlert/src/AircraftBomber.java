/**
 * This is concrete AircraftBomber Product that extends Aircraft and implements the Abstract Aircraft methods
 * @author ben
 *
 */
public class AircraftBomber extends Aircraft{
	public AircraftBomber(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}	
}
