
public abstract class AircraftBomberBuilder {
	public abstract void createAircraftBomber(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy);
	public abstract void buildWings();
	public abstract void buildProp();
	public abstract void buildFuselage();
	public abstract AircraftBomber getAircraftBomber();
}
