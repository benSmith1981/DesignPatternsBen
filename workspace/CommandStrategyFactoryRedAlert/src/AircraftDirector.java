
public class AircraftDirector {
	public static void construct(AircraftBomberBuilder aircraftBomberBuilder){
		aircraftBomberBuilder.buildFuselage();
		aircraftBomberBuilder.buildProp();
		aircraftBomberBuilder.buildWings();
	}
	
	public static void construct(AircraftMissileShooterBuilder aircraftMissileShooterBuilder) {
		aircraftMissileShooterBuilder.buildFuselage();
		aircraftMissileShooterBuilder.buildProp();
		aircraftMissileShooterBuilder.buildWings();
	}
}
