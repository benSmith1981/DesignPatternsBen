public class UnitFactory {	

	public static AircraftBomber getDefaultAircraftBomber(){
		DefaultAircraftBomberBuilder builder = new DefaultAircraftBomberBuilder();
		AircraftDirector.construct(builder);
		return builder.getAircraftBomber();
	}
	
	public static AircraftBomber getSpecialAircraftBomber(){
		SpecialAircraftBomberBuilder builder = new SpecialAircraftBomberBuilder();
		AircraftDirector.construct(builder);
		return builder.getAircraftBomber();
	}
	
	public static AircraftMissileShooter getDefautlAircraftMissileShooter(){
		DefaultAircraftMissileShooterBuilder builder = new DefaultAircraftMissileShooterBuilder();
		AircraftDirector.construct(builder);
		return builder.getAircraftMissileShooter();
	}
	
	public static AircraftMissileShooter getSpecialAircraftMissileShooter(){
		SpecialAircraftMissileShooterBuilder builder = new SpecialAircraftMissileShooterBuilder();
		AircraftDirector.construct(builder);
		return builder.getAircraftMissileShooter();
	}
	
	public static Tank createTank(){
		return new Tank();
	}
	
	public static Soldier createSoldier(){
		return new Soldier();
	}
}
