
public class DefaultAircraftMissileShooterBuilder extends AircraftMissileShooterBuilder {

	private AircraftMissileShooter aircraftMissileShooter;
	
	@Override
	public void createAircraftMissileShooter(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		aircraftMissileShooter = new AircraftMissileShooter(moveStrategy, fireStrategy, pictureStrategy);		
	}
	
	@Override
	public void buildWings() {
		aircraftMissileShooter.setWings("Default wings");
	}

	@Override
	public void buildProp() {
		aircraftMissileShooter.setPropellor("Default prop");
	}

	@Override
	public void buildFuselage() {
		aircraftMissileShooter.setFuselage("Default fuselage");
	}

	@Override
	public AircraftMissileShooter getAircraftMissileShooter() {
		return aircraftMissileShooter;
	}


}
