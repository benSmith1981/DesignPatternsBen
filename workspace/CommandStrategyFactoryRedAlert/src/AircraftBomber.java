public class AircraftBomber extends Aircraft{
		
	public AircraftBomber(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		super(moveStrategy, fireStrategy, pictureStrategy);
	}
	
	@Override
	public String toString(){
		return "Bomber: "+ this.getWings() + " - " + this.getFuselage() + " - " + this.getPropellor();
	}
}
