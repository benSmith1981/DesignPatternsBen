
public class SpecialAircraftMissileShooterBuilder extends AircraftMissileShooterBuilder {
	private AircraftMissileShooter aircraftMissileShooter = new AircraftMissileShooter();
	
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
