
public class SpecialAircraftBomberBuilder extends AircraftBomberBuilder {

	private AircraftBomber aircraftBomber = new AircraftBomber();
	@Override
	public void buildWings() {
		aircraftBomber.setWings("Special wings");
	}

	@Override
	public void buildProp() {
		aircraftBomber.setPropellor("Special prop");
	}

	@Override
	public void buildFuselage() {
		aircraftBomber.setFuselage("Special fuselage");
	}

	@Override
	public AircraftBomber getAircraftBomber() {
		return aircraftBomber;
	}

}
