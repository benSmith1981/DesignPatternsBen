
public class AircraftDirector {
	public static void construct(AircraftBomberBuilder aircraftBomberBuilder){
		aircraftBomberBuilder.createAircraftBomber(new Fly(), new DropBomb(), new TakePicture());
		aircraftBomberBuilder.buildFuselage();
		aircraftBomberBuilder.buildProp();
		aircraftBomberBuilder.buildWings();
	}
	
	public static void construct(AircraftMissileShooterBuilder aircraftMissileShooterBuilder) {
		aircraftMissileShooterBuilder.createAircraftMissileShooter(new Fly(), new FireMissile(), new TakePicture());
		aircraftMissileShooterBuilder.buildFuselage();
		aircraftMissileShooterBuilder.buildProp();
		aircraftMissileShooterBuilder.buildWings();
	}
}
