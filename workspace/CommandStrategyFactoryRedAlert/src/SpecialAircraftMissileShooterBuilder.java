
public class SpecialAircraftMissileShooterBuilder extends AircraftMissileShooterBuilder {
	private AircraftMissileShooter aircraftMissileShooter;
	
	@Override
	public void createAircraftMissileShooter(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		aircraftMissileShooter = new AircraftMissileShooter(moveStrategy,fireStrategy, pictureStrategy);
	}

	@Override
	public void buildWings() {
		aircraftMissileShooter.setWings("Special wings");
	}

	@Override
	public void buildProp() {
		aircraftMissileShooter.setPropellor("Special prop");
	}

	@Override
	public void buildFuselage() {
		aircraftMissileShooter.setFuselage("Special fuselage");
	}

	@Override
	public AircraftMissileShooter getAircraftMissileShooter() {
		return aircraftMissileShooter;
	}


}
