
public class SpecialAircraftBomberBuilder extends AircraftBomberBuilder {

	private AircraftBomber aircraftBomber;
	
	@Override
	public void createAircraftBomber(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		aircraftBomber = new AircraftBomber(moveStrategy, fireStrategy, pictureStrategy);
	}
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
