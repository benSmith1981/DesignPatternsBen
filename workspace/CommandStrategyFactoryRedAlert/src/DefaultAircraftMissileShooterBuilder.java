
public class DefaultAircraftMissileShooterBuilder extends AircraftMissileShooterBuilder {

	private AircraftMissileShooter aircraftMissileShooter = new AircraftMissileShooter();
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
