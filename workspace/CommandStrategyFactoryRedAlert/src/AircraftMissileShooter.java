public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		super(moveStrategy, fireStrategy, pictureStrategy);
	}
	
	@Override
	public String toString(){
		return "MissileShooter: "+ this.getWings() + " - " + this.getFuselage() + " - " + this.getPropellor();
	}
}
