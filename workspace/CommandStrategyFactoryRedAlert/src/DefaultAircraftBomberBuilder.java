
public class DefaultAircraftBomberBuilder extends AircraftBomberBuilder {

	private AircraftBomber aircraftBomber;
	
	public void createAircraftBomber(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy) {
		aircraftBomber = new AircraftBomber(moveStrategy, fireStrategy, pictureStrategy);
	}
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
