public class AircraftMissileShooter extends Aircraft {
	
	public AircraftMissileShooter(){
		super(new Fly(), new DropBomb(), new TakePicture());
	}
	
	@Override
	public String toString(){
		return "MissileShooter: "+ this.getWings() + " - " + this.getFuselage() + " - " + this.getPropellor();
	}
}
