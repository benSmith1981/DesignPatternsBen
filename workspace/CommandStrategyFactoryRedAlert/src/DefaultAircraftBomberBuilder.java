
public class DefaultAircraftBomberBuilder extends AircraftBomberBuilder {

	private AircraftBomber aircraftBomber = new AircraftBomber();
	@Override
	public void buildWings() {
		aircraftBomber.setWings("Default wings");
	}

	@Override
	public void buildProp() {
		aircraftBomber.setPropellor("Default prop");
	}

	@Override
	public void buildFuselage() {
		aircraftBomber.setFuselage("Default fuselage");
	}

	@Override
	public AircraftBomber getAircraftBomber() {
		return aircraftBomber;				
	}
}
