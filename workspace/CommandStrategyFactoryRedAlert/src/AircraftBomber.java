public class AircraftBomber extends Aircraft{
	
	public AircraftBomber(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}	
}
