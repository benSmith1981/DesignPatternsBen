
public class AircraftBomber extends Unit{

	public AircraftBomber(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}	
}
