
public abstract class AircraftMissileShooterBuilder {
	public abstract void createAircraftMissileShooter(MoveStrategy moveStrategy, FireAtTargetStrategy fireStrategy, TakePictureOfTargetStrategy pictureStrategy);
	public abstract void buildWings();
	public abstract void buildProp();
	public abstract void buildFuselage();
	public abstract AircraftMissileShooter getAircraftMissileShooter();

}
