public class AircraftBomber extends Aircraft{
	
	public AircraftBomber(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}	
	
	@Override
	public String toString(){
		return "Bomber: "+ this.getWings() + " - " + this.getFuselage() + " - " + this.getPropellor();
	}
}
